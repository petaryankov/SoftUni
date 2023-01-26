package zoo.entities.areas;

import zoo.entities.animals.Animal;
import zoo.entities.foods.Food;

import java.util.Collection;

public abstract class BaseArea implements Area{
    private String name;
    private int capacity;
    private Collection<Food> foods;
    private Collection<Animal> animals;

    //todo
    public BaseArea(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        //todo collections
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return null;
    }

    @Override
    public Collection<Food> getFoods() {
        return null;
    }

    @Override
    public int sumCalories() {
        return 0;
    }

    @Override
    public void addAnimal(Animal animal) {

    }

    @Override
    public void removeAnimal(Animal animal) {

    }

    @Override
    public void addFood(Food food) {

    }

    @Override
    public void feed() {

    }

    @Override
    public String getInfo() {
        return null;
    }
}
