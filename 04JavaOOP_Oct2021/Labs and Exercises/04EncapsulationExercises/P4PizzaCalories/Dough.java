package day4.EncapsulationExercises.P4.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public double calculateCalories() {
        double flour;
        double white = 1.5;
        double wholegrain = 1.0;
        if (this.flourType.equals("White")) {
            flour = white;
        } else {
            flour = wholegrain;
        }

        double technique = -1;
        double crispy = 0.9;
        double chewy = 1.1;
        double homemade = 1.0;

        switch (this.bakingTechnique) {
            case "Crispy":
                technique = crispy;
                break;
            case "Chewy":
                technique = chewy;
                break;
            case "Homemade":
                technique = homemade;
                break;
        }
        return this.weight * 2 * flour * technique;
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "White":
            case "Wholegrain":
                this.flourType = flourType;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }
}
