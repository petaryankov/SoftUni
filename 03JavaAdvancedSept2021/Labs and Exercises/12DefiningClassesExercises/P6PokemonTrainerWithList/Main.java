package day12.DefiningClassesExercises.Demo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();
        while (!input.equals("Tournament")) {
            String[] pokemonData = input.split("\\s+");
            String trainerName = pokemonData[0];
            String pokemonName = pokemonData[1];
            String pokemonElement = pokemonData[2];
            int pokemonHealth = Integer.parseInt(pokemonData[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = new Trainer(trainerName);
            trainers.putIfAbsent(trainerName, trainer);
            trainers.get(trainerName).getPokemons().add(pokemon);

            input = scanner.nextLine();
        }

        String element = scanner.nextLine();

        while (!element.equals("End")) {
            for (Trainer trainer : trainers.values()) {
                if (trainer.hasPokemonElement(element)) {
                    trainer.incrementBadges(1);
                } else {
                    trainer.pokemonsHealthReduction(10);
                    trainer.clearDeadPokemons();
                }
            }

            element = scanner.nextLine();
        }
        trainers.values().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getBadges(), e1.getBadges()))
                .forEach(System.out::println);

    }

}
