<<<<<<< HEAD
package day6.InheritanceExercises.P5.Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private final static double COFFEE_MILLILITERS = 50;
    private final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private double caffeine;

    public Coffee(String name, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
=======
package day6.InheritanceExercises.P5.Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private final static double COFFEE_MILLILITERS = 50;
    private final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private double caffeine;

    public Coffee(String name, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
>>>>>>> 01fe2f6f0ac21139af5e53f4afa82ef454bb6c19
