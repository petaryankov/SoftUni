<<<<<<< HEAD
package day6.InheritanceExercises.P5.Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{
    private final static double CAKE_GRAMS = 250;
    private final static double CAKE_CALORIES = 1000;
    private final static BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);
    public Cake(String name) {
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }
}
=======
package day6.InheritanceExercises.P5.Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{
    private final static double CAKE_GRAMS = 250;
    private final static double CAKE_CALORIES = 1000;
    private final static BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);
    public Cake(String name) {
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }
}
>>>>>>> 01fe2f6f0ac21139af5e53f4afa82ef454bb6c19
