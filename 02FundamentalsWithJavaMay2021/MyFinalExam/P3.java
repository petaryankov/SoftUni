package day20MyFinalExam;

import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commands = scanner.nextLine();
        Map<String, Hero> heroes = new TreeMap<>();

        while (!commands.equals("Results")) {
            String command = commands.split(":")[0];

            switch (command) {
                case "Add":
                    String addHeroName = commands.split(":")[1];
                    int addHeroHealth = Integer.parseInt(commands.split(":")[2]);
                    int addHeroEnergy = Integer.parseInt(commands.split(":")[3]);
                    if (heroes.containsKey(addHeroName)) {
                        int health = heroes.get(addHeroName).getHealth() + addHeroHealth;
                        heroes.get(addHeroName).setHealth(health);
                    } else {
                        Hero newHero = new Hero(addHeroHealth, addHeroEnergy);
                        heroes.put(addHeroName, newHero);
                    }
                    break;
                case "Attack":
                    String attackerName = commands.split(":")[1];
                    String defenderName = commands.split(":")[2];
                    int damage = Integer.parseInt(commands.split(":")[3]);
                    if (heroes.containsKey(attackerName) && heroes.containsKey(defenderName)) {
                        int defenderHealth = heroes.get(defenderName).getHealth();
                        int attackerEnergy = heroes.get(attackerName).getEnergy();
                        heroes.get(defenderName).setHealth(defenderHealth - damage);
                        heroes.get(attackerName).setEnergy(attackerEnergy - 1);
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
        heroes.entrySet().stream().sorted((h1, h2) ->
                Integer.compare(h2.getValue().getHealth(), h1.getValue().getHealth()))
                .forEach(e -> System.out.printf("%s - %d - %d\n"
                , e.getKey(), e.getValue().getHealth(), e.getValue().getEnergy()));
    }
}

class Hero {
    private int health;
    private int energy;

    public Hero(int health, int energy) {
        this.health = health;
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
