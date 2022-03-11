package day12.DefiningClassesExercises.P6PokemonTrainer;

import java.util.*;

public class Trainer {
    private String name;
    private int numBadges;
    private Map<String, List<Pokemon>> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numBadges = 0;
        this.setPokemon();
    }

    private void setPokemon() {
        this.pokemons = new HashMap<>();
        this.pokemons.put("Fire", new ArrayList<>());
        this.pokemons.put("Water", new ArrayList<>());
        this.pokemons.put("Electricity", new ArrayList<>());
    }

    private int getNumPokemons() {
        int numPokemons = 0;
        for (List<Pokemon> pokemonList : pokemons.values()) {
            numPokemons += pokemonList.size();
        }
        return numPokemons;
    }
    @Override
    public String toString() {
        return this.name + " " + this.numBadges + " " + getNumPokemons();
    }

    public int getNumBadges() {
        return this.numBadges;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.putIfAbsent(pokemon.getElement(), new ArrayList<>());
        this.pokemons.get(pokemon.getElement()).add(pokemon);
    }

    public boolean hasElementType(String element) {
        return !this.pokemons.get(element).isEmpty();
    }

    public void incrementBadges(int increment) {
        this.numBadges += increment;
    }

    public void damagePokemons(int damage) {
        for (List<Pokemon> pokemonsList : pokemons.values()) {
            for (Pokemon pokemon : pokemonsList) {
                pokemon.takeHealthDamage(damage);
            }
        }
        this.clearDeadPokemons();
    }
    private void clearDeadPokemons() {
        for (List<Pokemon> pokemonList : pokemons.values()) {
            pokemonList.removeIf(pokemon -> pokemon.getHealth() <= 0);
        }
    }
}
