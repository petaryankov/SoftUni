package orm;

import orm.annotations.Column;
import orm.annotations.Entity;
import orm.annotations.Id;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EntityManager<E> implements DbContext<E> {
    private final Connection connection;

    public EntityManager(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean persist(E entity) throws IllegalAccessException, SQLException {
        Field idField = getIdField(entity.getClass());
        idField.setAccessible(true);
        Object idValue = idField.get(entity);
        if (idValue == null || (int) idValue == 0) {
            return insertEntity(entity);
        }
        return false;
    }

    private boolean insertEntity(E entity) throws SQLException {
        String INSERT_QUERY = "INSERT INTO %s(%s) VALUES (%s);";
        String tableName = getTableName(entity.getClass());
        String fieldNamesWithoutId = getFieldNamesWithoutId(entity.getClass());
        String fieldValuesWithoutId = getFieldValuesWithoutId(entity);
        String query = String.format(INSERT_QUERY, tableName, fieldNamesWithoutId, fieldValuesWithoutId);

        PreparedStatement preparedStatement = this.connection.prepareStatement(query);

        return preparedStatement.executeUpdate() == 1;
    }

    private String getFieldValuesWithoutId(E entity) {
        Class<?> entityClass = entity.getClass();
        Field idField = getIdField(entityClass);

        return Arrays.stream(entityClass.getDeclaredFields())
                .filter(e -> !e.getName().equals(idField.getName()))
                .filter(e -> e.isAnnotationPresent(Column.class))
                .map(e -> {
                    e.setAccessible(true);
                    try {
                        Object value = e.get(entity);
                        return String.format("'%s'", value.toString());

                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }
                }).collect(Collectors.joining(","));

    }

    private String getFieldNamesWithoutId(Class<?> entityClass) {
        Field idField = getIdField(entityClass);
        return Arrays.stream(entityClass.getDeclaredFields())
                .filter(e -> !e.getName().equals(idField.getName()))
                .filter(e -> e.isAnnotationPresent(Column.class))
                .map(e -> e.getAnnotation(Column.class).name())
                .collect(Collectors.joining(","));
    }

    private String getTableName(Class<?> entityClass) {
        Entity annotation = entityClass.getAnnotation(Entity.class);
        if (annotation == null) {
            throw new UnsupportedOperationException("Entity must have Entity annotation");
        }
        return annotation.name();
    }

    private Field getIdField(Class<?> entityClass) {
        return Arrays.stream(entityClass.getDeclaredFields())
                .filter(e -> e.isAnnotationPresent(Id.class))
                .findFirst().orElseThrow(() -> new UnsupportedOperationException("Entity does not have ID column"));
    }

    @Override
    public Iterable<E> find(Class<E> table) {
        return find(table, null);
    }

    @Override
    public Iterable<E> find(Class<E> table, String where) {
        return null;
    }

    @Override
    public E findFirst(Class<E> table) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return findFirst(table, null);
    }

    @Override
    public E findFirst(Class<E> table, String where) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final String SELECT_QUERY_SINGLE = "SELECT * FROM %s %S LIMIT 1";
        String tableName = getTableName(table);
        String actualWhere = where == null ? "" : where;
        String query = String.format(SELECT_QUERY_SINGLE, tableName, actualWhere);

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return createEntity(table, resultSet);
        }
        return null;
    }

    private E createEntity(Class<E> table, ResultSet resultSet) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        E entity = table.getDeclaredConstructor().newInstance();

        Arrays.stream(table.getDeclaredFields())
                .filter(e -> e.isAnnotationPresent(Column.class))
                .forEach(e -> {
                    try {
                        fillFieldData(entity, e, resultSet);
                    } catch (SQLException | IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }
                });
        return entity;
    }

    private void fillFieldData(E entity, Field field, ResultSet resultSet) throws SQLException, IllegalAccessException {
        field.setAccessible(true);

        String fieldName = field.getAnnotation(Column.class).name();
        Object value;

        Class<?> fieldType = field.getType();

        if (fieldType == int.class) {
            value = resultSet.getInt(fieldName);

        } else if (fieldType == LocalDate.class) {
            String stringDate = resultSet.getString(fieldName);
            value = LocalDate.parse(stringDate);

        } else {
            value = resultSet.getString(fieldName);
        }

        field.set(entity, value);
    }
}
