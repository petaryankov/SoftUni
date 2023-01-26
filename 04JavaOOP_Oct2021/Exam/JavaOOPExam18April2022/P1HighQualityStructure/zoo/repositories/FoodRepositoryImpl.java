package zoo.repositories;

import zoo.entities.foods.Food;

import java.util.Collection;

public class FoodRepositoryImpl implements FoodRepository{
    private Collection<Food> foods;
    //todo

    @Override
    public void add(Food food) {

    }

    @Override
    public boolean remove(Food food) {
        return false;
    }

    @Override
    public Food findByType(String type) {
        return null;
    }
}
