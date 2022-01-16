package day20MyFinalExam;

import java.util.*;

public class P3A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> heroes = new TreeMap<>();

        String commands = scanner.nextLine();
        while (!commands.equals("Results")) {
            String command = commands.split(":")[0];

            switch (command) {
                case "Add":
                    String addHeroName = commands.split(":")[1];
                    int addHeroHealth = Integer.parseInt(commands.split(":")[2]);
                    int addHeroEnergy = Integer.parseInt(commands.split(":")[3]);
                    if (heroes.containsKey(addHeroName)) {
                        int newHealth = heroes.get(addHeroName).get(0) + addHeroHealth;
                        heroes.get(addHeroName).remove(0);
                        heroes.get(addHeroName).add(0, newHealth);
                    } else {
                        heroes.put(addHeroName, new ArrayList<>
                                (Arrays.asList(addHeroHealth, addHeroEnergy)));

                    }
                    break;
                case "Attack":
                    String attackerName = commands.split(":")[1];
                    String defenderName = commands.split(":")[2];
                    int damage = Integer.parseInt(commands.split(":")[3]);
                    if (heroes.containsKey(attackerName) && heroes.containsKey(defenderName)) {
                        int defenderHealth = heroes.get(defenderName).get(0);
                        int attackerEnergy = heroes.get(attackerName).get(1);
                        heroes.get(defenderName).set(0, defenderHealth - damage);
                        heroes.get(attackerName).set(1, attackerEnergy - 1);
                        if (defenderHealth - damage <= 0) {
                            heroes.remove(defenderName);
                            System.out.println(defenderName + " was disqualified!");
                        }
                        if (attackerEnergy - 1 <= 0) {
                            heroes.remove(attackerName);
                            System.out.println(attackerName + " was disqualified!");
                        }
                    }
                    break;
                case "Delete":
                    String toDelete = commands.split(":")[1];
                    if (toDelete.equals("All")) {
                        heroes.clear();
                    } else {
                        heroes.remove(toDelete);
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
        System.out.println("People count: " + heroes.size());
        heroes.entrySet().stream().sorted((h1, h2)->
                Integer.compare(h2.getValue().get(0), h1.getValue().get(0)))
                .forEach(e -> System.out.printf("%s - %d - %d\n"
                        , e.getKey(), e.getValue().get(0), e.getValue().get(1)));
    }
}
