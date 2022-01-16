package day6ArraysExercises;

import java.util.Scanner;

public class P9KaminoFactory1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split("!");
        int counterDna = 0;
        int bestDnaSample = 0;
        int bestSum = 0;
        int currentIndex = 100;
        int bestIndex = 100;
        int currentIndex1 = 100;
        int maxCounter1 = Integer.MIN_VALUE;
        boolean isSequences = false;
        String[] bestDna = new String[dnaLength];
        while (!commands[0].equals("Clone them")) {
            //1!0!1!1!0
            counterDna++;
            int counter1 = 0;
            for (int index = 0; index < commands.length - 1; index++) {
                if (commands[index].equals(commands[index + 1]) && commands[index].equals("1")) {
                    counter1++;
                    isSequences = true;
                    if (counter1 == 1) {
                        currentIndex = index;
                    }
                }
                if (commands[index].equals("1")) {
                    if (currentIndex1 > index)
                        currentIndex1 = index;
                }
            }
            int sum = 0;
            for (String command : commands) {
                if (command.equals("1")) {
                    sum++;
                }

            }
            if (counter1 >= maxCounter1 && currentIndex < bestIndex) {
                maxCounter1 = counter1;
                bestDnaSample = counterDna;
                bestDna = commands;
                bestSum = sum;
                bestIndex = currentIndex;

            } else if (counter1 == 0 && !isSequences && sum > 0) {
                if (currentIndex1 < bestIndex) {
                    bestDna = commands;
                    bestSum = sum;
                    bestDnaSample = counterDna;
                    bestIndex = currentIndex1;
                } else if (currentIndex1 == bestIndex && sum > bestSum ){
                        bestSum = sum;
                        bestDna = commands;
                        bestDnaSample = counterDna;
                        bestIndex = currentIndex1;

                }


            } else if (counter1 == 0 && !isSequences && sum == 0) {
                bestDnaSample = 1;
                bestDna = commands;
            }
            commands = scanner.nextLine().split("!");
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestDnaSample, bestSum);
        for (String s : bestDna) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
