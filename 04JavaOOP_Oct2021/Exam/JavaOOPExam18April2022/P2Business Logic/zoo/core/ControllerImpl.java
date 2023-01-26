package zoo.core;

import zoo.common.ConstantMessages;
import zoo.common.ExceptionMessages;
import zoo.entities.animals.Animal;
import zoo.entities.animals.AquaticAnimal;
import zoo.entities.animals.TerrestrialAnimal;
import zoo.entities.areas.Area;
import zoo.entities.areas.LandArea;
import zoo.entities.areas.WaterArea;
import zoo.entities.foods.Food;
import zoo.entities.foods.Meat;
import zoo.entities.foods.Vegetable;
import zoo.repositories.FoodRepository;
import zoo.repositories.FoodRepositoryImpl;

import java.util.LinkedHashMap;
import java.util.Map;

public class ControllerImpl implements Controller {
    private FoodRepository foodRepository;
    private Map<String, Area> areas;

    public ControllerImpl() {
        this.areas = new LinkedHashMap<>();
        this.foodRepository = new FoodRepositoryImpl();
    }

    @Override
    public String addArea(String areaType, String areaName) {
        Area area;
        switch (areaType) {
            case "WaterArea":
                area = new WaterArea(areaName);
                areas.put(areaName,area);
                break;
            case "LandArea":
                area = new LandArea(areaName);
                areas.put(areaName, area);
                break;
            default:
                throw new NullPointerException(ExceptionMessages.INVALID_AREA_TYPE);
        }
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_AREA_TYPE, areaType);
    }

    @Override
    public String buyFood(String foodType) {
        Food food;
        switch (foodType) {
            case "Vegetable":
                food = new Vegetable();
                foodRepository.add(food);
                break;
            case "Meat":
                food = new Meat();
                foodRepository.add(food);
                break;
            default:
                throw new NullPointerException(ExceptionMessages.INVALID_FOOD_TYPE);
        }
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_FOOD_TYPE, foodType);
    }

    @Override
    public String foodForArea(String areaName, String foodType) {
        Food foodToAdd = foodRepository.findByType(foodType);
        if (foodToAdd == null) {
            throw new IllegalArgumentException(
                    String.format(ExceptionMessages.NO_FOOD_FOUND, foodType));
        }
        areas.get(areaName).addFood(foodToAdd);
        foodRepository.remove(foodToAdd);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_FOOD_IN_AREA,
                foodType, areaName);
    }

    @Override
    public String addAnimal(String areaName, String animalType, String animalName, String kind, double price) {

        Animal animal;
        boolean isFullCapacity = true;
        switch (animalType) {
            case "AquaticAnimal":
                animal = new AquaticAnimal(animalName, kind, price);
                break;
            case "TerrestrialAnimal":
                animal = new TerrestrialAnimal(animalName, kind, price);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_ANIMAL_TYPE);
        }
        if (areas.get(areaName).getAnimals().size() == 10) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_ENOUGH_CAPACITY);
        }
        areas.get(areaName).addAnimal(animal);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_ANIMAL_IN_AREA,
                animalType, areaName);
    }

    @Override
    public String feedAnimal(String areaName) {
        areas.get(areaName).getAnimals().forEach(Animal::eat);
        int size = areas.get(areaName).getAnimals().size();

        return String.format(ConstantMessages.ANIMALS_FED, size);
    }

    @Override
    public String calculateKg(String areaName) {
        double sum = areas.get(areaName).getAnimals().stream()
                .mapToDouble(Animal::getKg).sum();
        return String.format(ConstantMessages.KILOGRAMS_AREA, areaName, sum);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        for (Area area : areas.values()) {
            sb.append(String.format("%s (%s):",area.getName(), area.getClass().getSimpleName()));
            area.getInfo();
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
