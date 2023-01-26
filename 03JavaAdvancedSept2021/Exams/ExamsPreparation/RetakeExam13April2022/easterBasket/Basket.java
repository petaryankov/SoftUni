package ExamsPreparation.RetakeExam13April2022.easterBasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        data = new ArrayList<>();
    }
    public void addEgg(Egg egg) {
        if (data.size() < capacity) {
            data.add(egg);
        }
    }
    public boolean removeEgg(String color) {
        for (Egg egg : data) {
            if (egg.getColor().equals(color)) {
                data.remove(egg);
                return true;
            }
        }
        return false;
    }
    public Egg getStrongestEgg() {
        Egg strongestEgg = null;
        int maxStrength = -1;
        for (Egg egg : data) {
            if (egg.getStrength() > maxStrength) {
                maxStrength = egg.getStrength();
                strongestEgg = egg;
            }
        }
        return strongestEgg;
    }
    public Egg getEgg(String color) {
        Egg object = null;
        for (Egg egg : data) {
            if (egg.getColor().equals(color)) {
                object = egg;
            }
        }
        return object;
    }
    public int getCount() {
        return data.size();
    }
    public String report() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("%s basket contains:\n", this.material));
        for (Egg egg : data) {
            result.append(egg).append(System.lineSeparator());
        }
        return result.toString().trim();
    }
}
