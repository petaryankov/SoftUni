package day10.PolymorphismExercises.P3.WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String animalsInput = scanner.nextLine();
        while (!animalsInput.equals("End")) {
            String[] animalsData = animalsInput.split("\\s+");

            Animal animal = createAnimal(animalsData);
            animals.add(animal);
            String[] foodInput = scanner.nextLine().split("\\s+");
            Food food = createFood(foodInput);

            animal.makeSound();
            try {
                animal.eat(food);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            animalsInput = scanner.nextLine();
        }
        animals.forEach(e -> System.out.println(e.toString()));
    }

    private static Food createFood(String[] foodInput) {
        String typeOfFood = foodInput[0];
        int amount = Integer.parseInt(foodInput[1]);
        if (typeOfFood.equals("Vegetable")) {
            return new Vegetable(amount);
        } else if (typeOfFood.equals("Meat")) {
            return new Meat(amount);
        } else {
            throw new IllegalArgumentException("No such food");
        }
    }

    public static Animal createAnimal(String[] animalsData) {
        String animalType = animalsData[0];
        String animalName = animalsData[1];
        double animalWeight = Double.parseDouble(animalsData[2]);
        String animalLivingRegion = animalsData[3];
        switch (animalType) {
            case "Cat":
                String breed = animalsData[4];
                //return new Cat(animalName, animalType, animalWeight, animalLivingRegion, breed);
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
            default:
                throw new IllegalArgumentException("No such animal");
        }
    }
}
