package ExamsPreparation.RetakeExam14April2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> tulipsStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(tulipsStack::push);

        Deque<Integer> daffodilsQueue = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        int bouquetFlowers = 15;
        int targetBouquets = 5;
        int currentBouquets = 0;
        int leftFlowers = 0;

        while (!tulipsStack.isEmpty() && !daffodilsQueue.isEmpty()) {
            int currentTulips = tulipsStack.pop();
            int currentDaffodils = daffodilsQueue.poll();
            int currentSumFlowers = currentTulips + currentDaffodils;

            if (currentSumFlowers >= bouquetFlowers) {
                if (currentSumFlowers == bouquetFlowers) {
                    currentBouquets++;
                    currentSumFlowers = 0;
                }
                while (currentSumFlowers > bouquetFlowers) {
                    currentTulips -= 2;
                    currentSumFlowers = currentTulips + currentDaffodils;
                    if (currentSumFlowers == bouquetFlowers) {
                        currentBouquets++;
                        currentSumFlowers = 0;
                    }
                }

            }
                leftFlowers += currentSumFlowers;

        }
        if (leftFlowers >= 15) {
            currentBouquets += leftFlowers / 15;
        }
        if (currentBouquets >= targetBouquets) {
            System.out.printf("You made it! You go to the competition with %d bouquets!", currentBouquets);
        } else {
            System.out.printf("You failed... You need more %d bouquets.", targetBouquets - currentBouquets);
        }

    }
}
