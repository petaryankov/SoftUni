package day12.DefiningClassesExercises.Demo;

import java.util.ArrayList;
import java.util.List;


public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public int getBadges() {
        return badges;
    }

    public void incrementBadges(int increment) {
        this.badges += increment;
    }


    public boolean hasPokemonElement(String element) {
        return pokemons.stream()
                .anyMatch(e -> e.getElement().equals(element));
    }

    public void pokemonsHealthReduction(int reduction) {
        pokemons.forEach(e -> e.healthReduction(reduction));
    }

    public void clearDeadPokemons() {
        for (int index = 0; index < pokemons.size(); index++) {

                if (pokemons.get(index).getHealth() <= 0) {
                    pokemons.remove(index);
                    index--;
                }

        }

    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.badges, this.pokemons.size());
    }
}
