package day4.EncapsulationExercises.P2.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name.length() < 1 || name.equals(" ")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double eggs = 0;
        if (age < 6) {
            eggs = 2;
        } else if (age < 12) {
            eggs = 1;
        } else {
            eggs = 0.75;
        }
        return eggs;
    }

    @Override
    public String toString() {
        return String.format("Chicken Chichi (age %d) can produce %.2f eggs per day.", this.age, this.productPerDay());
    }

}
