package org.example;

import entities.Courses;
import entities.User;
import orm.EntityManager;
import orm.MyConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException {
        MyConnector.createConnection("root", "1234", "soft_uni");

        Connection connection = MyConnector.getConnection();
        EntityManager<User> userEntityManager = new EntityManager<>(connection);

        boolean persistResult = userEntityManager.persist(new User("user", "passw", 22, LocalDate.now()));
        System.out.println(persistResult);
        EntityManager<Courses> coursesEntityManager = new EntityManager<>(connection);
        coursesEntityManager.persist(new Courses("Math", 12));
    }
}