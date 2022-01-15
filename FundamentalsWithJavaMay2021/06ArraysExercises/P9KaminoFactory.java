package day6ArraysExercises;

import java.util.Scanner;

public class P9KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfSequences = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        String[] dna = new String[lengthOfSequences];
        int bestSum = 0;
        int bestDnaCounter = 0;
        int dnaCounter = 0;
        String bestDna = "";
        int bestIndex = 0;
        int maxLength = 0;

        while (!command.equals("Clone them!")) {
            command = command.replace("!", "");// remove "!" from command
            dna = command.split("0");

            dnaCounter++;
            int sum = 0;// sum of 1
            int bestDnaLength = 0;
            //[1][11]
            for (int index = 0; index < dna.length; index++) {
                // calculate sum of 1
                sum += dna[index].length();
                //find the best sequence
                if (dna[index].length() > bestDnaLength) {
                    bestDnaLength = dna[index].length();
                    bestIndex = index;
                    bestDna = command;
                    bestSum = sum;
                } //else if (dna[index].length() == bestDnaLength
//                        && index < bestIndex || sum > bestSum) {
//                    bestDnaLength = dna[index].length();
//                    bestIndex = index;
//                    bestSum = sum;
//                    bestDnaCounter = dnaCounter;
//                    bestDna = command;
//                }
            }
            if (bestDnaLength > maxLength) {
                maxLength = bestDnaLength;
                bestSum = sum;
                bestDnaCounter = dnaCounter;
                bestDna = command;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", bestDnaCounter, bestSum);
        for (int i = 0; i < bestDna.length(); i++) {
            System.out.print(bestDna.charAt(i) + " ");
        }

    }
}