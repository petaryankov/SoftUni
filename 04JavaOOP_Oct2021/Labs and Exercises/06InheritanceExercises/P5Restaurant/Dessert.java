<<<<<<< HEAD
package day6.InheritanceExercises.P5.Restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private double calories;

    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
=======
package day6.InheritanceExercises.P5.Restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private double calories;

    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
>>>>>>> 01fe2f6f0ac21139af5e53f4afa82ef454bb6c19
