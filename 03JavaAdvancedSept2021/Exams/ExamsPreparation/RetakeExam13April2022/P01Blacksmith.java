package ExamsPreparation.RetakeExam13April2022;

import java.util.*;

public class P01Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> steelQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(steelQueue::offer);
        ArrayDeque<Integer> carbonStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("" + "\\s+"))
                .map(Integer::parseInt).forEach(carbonStack::push);
        Map<String, Integer> swords = new TreeMap<>();
        swords.put("Gladius", 0);
        swords.put("Shamshir", 0);
        swords.put("Katana", 0);
        swords.put("Sabre", 0);
        while (!steelQueue.isEmpty() && !carbonStack.isEmpty()) {
            int currentSteel = steelQueue.poll();
            int currentCarbon = carbonStack.peek();
            int sum = currentSteel + currentCarbon;
            if (sum == 70) {
                swords.put("Gladius", swords.get("Gladius") + 1);
                carbonStack.poll();
            } else if (sum == 80) {
                swords.put("Shamshir", swords.get("Shamshir") + 1);
                carbonStack.poll();
            } else if (sum == 90) {
                swords.put("Katana", swords.get("Katana") + 1);
                carbonStack.poll();
            } else if (sum == 110) {
                swords.put("Sabre", swords.get("Sabre") + 1);
                carbonStack.poll();
            } else {
                carbonStack.pop();
                carbonStack.push(currentCarbon + 5);
            }
        }
        int sum = swords.values().stream().mapToInt(Integer::intValue).sum();
        if (sum > 0) {
            System.out.printf("You have forged %d swords.\n", sum);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }
        if (steelQueue.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            StringJoiner steelLeft = new StringJoiner(", ");
            steelQueue.forEach(e -> steelLeft.add(e.toString()));
            System.out.println("Steel left: " + steelLeft);
        }
        if (carbonStack.isEmpty()) {
            System.out.println("Carbon left: none");
        } else {
            StringJoiner carbonLeft = new StringJoiner(", ");
            carbonStack.forEach(e -> carbonLeft.add(e.toString()));
            System.out.println("Carbon left: " + carbonLeft);
        }
        if (sum > 0) {
            swords.entrySet().stream().filter(e -> e.getValue() > 0)
                    .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
        }
    }
}
