<<<<<<< HEAD
package day6.InheritanceExercises.P5.Restaurant;

import java.math.BigDecimal;

public class Food extends Product {
    private double grams;
    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
=======
package day6.InheritanceExercises.P5.Restaurant;

import java.math.BigDecimal;

public class Food extends Product {
    private double grams;
    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
>>>>>>> 01fe2f6f0ac21139af5e53f4afa82ef454bb6c19
