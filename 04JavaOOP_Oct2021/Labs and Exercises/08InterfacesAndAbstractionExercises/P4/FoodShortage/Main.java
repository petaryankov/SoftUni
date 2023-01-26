package day8.InterfacesAndAbstractionExercises.P4.FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyers = new HashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 4) {
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]),
                        tokens[2], tokens[3]);
                buyers.put(citizen.getName(), citizen);
            } else {
                Rebel rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                buyers.put(rebel.getName(), rebel);
            }
        }
        String name = scanner.nextLine();
        while (!name.equals("End")) {
            if (buyers.containsKey(name)) {
                buyers.get(name).buyFood();
            }
            name = scanner.nextLine();
        }
        int sum = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(sum);
    }
}
