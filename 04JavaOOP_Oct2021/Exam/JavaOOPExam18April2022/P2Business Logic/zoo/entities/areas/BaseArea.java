package zoo.entities.areas;

import zoo.common.ConstantMessages;
import zoo.common.ExceptionMessages;
import zoo.entities.animals.Animal;
import zoo.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseArea implements Area {
    private String name;
    private int capacity;
    private Collection<Food> foods;
    private Collection<Animal> animals;

    //todo
    public BaseArea(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        this.foods = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.AREA_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return this.animals;
    }

    @Override
    public Collection<Food> getFoods() {
        return this.foods;
    }

    @Override
    public int sumCalories() {
        return foods.stream().mapToInt(Food::getCalories).sum();
    }

    @Override
    public void addAnimal(Animal animal) {
        if (capacity == animals.size()) {
            throw new IllegalStateException(ExceptionMessages.NOT_ENOUGH_CAPACITY);
        }
        animals.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void addFood(Food food) {
        foods.add(food);
    }

    @Override
    public void feed() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        if (animals == null) {
            sb.append("non");
        } else {
            sb.append(this.name + " " + Area.class.getSimpleName());
        }
        sb.append(System.lineSeparator());
        sb.append("Animals: ");
        if (animals == null) {
            sb.append("non");
        } else {
            String join = null;
            for (Animal animal : animals) {
                join = String.join(" ", animal.getName());
            }
            sb.append(join);
        }
        sb.append(System.lineSeparator());
        sb.append("Foods: ");
        double sumFood = foods.stream().mapToDouble(Food::getPrice).sum();
        sb.append(String.format("%.2f",sumFood));
        sb.append(System.lineSeparator());
        sb.append("Calories: ");
        double sumCalories = foods.stream().mapToDouble(Food::getCalories).sum();
        sb.append(String.format("%.2f",sumCalories));
        return sb.toString();
    }
}
