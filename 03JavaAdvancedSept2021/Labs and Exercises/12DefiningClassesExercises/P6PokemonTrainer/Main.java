package day12.DefiningClassesExercises.P6PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainers.putIfAbsent(trainerName, trainer);
            trainers.get(trainerName).addPokemon(pokemon);
            input = scanner.nextLine();
        }
        String element = scanner.nextLine();
        while (!element.equals("End")) {
            for (Trainer trainer : trainers.values()) {
                if (trainer.hasElementType(element)) {
                    trainer.incrementBadges(1);
                } else {
                    trainer.damagePokemons(10);
                }
            }
            element = scanner.nextLine();
        }
        trainers.entrySet().stream().sorted((e1, e2) ->
                        Integer.compare(e2.getValue().getNumBadges(), e1.getValue().getNumBadges()))
                .forEach(e -> System.out.println(e.getValue()));
    }

}
