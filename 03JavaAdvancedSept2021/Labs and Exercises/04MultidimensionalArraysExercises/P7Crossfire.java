package day4.MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P7Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        List<List<Integer>> matrixList = new ArrayList<>();
        //int[][] matrix = new int[5][5];
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrixList.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrixList.get(row).add(number++);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            String[] numbers = command.split("\\s+");
            int row = Integer.parseInt(numbers[0]);
            int col = Integer.parseInt(numbers[1]);
            int range = Integer.parseInt(numbers[2]);

            if (col < 0 || row < 0 || row > matrixList.size()) {
                command = scanner.nextLine();
                continue;
            }
            // current row
            List<Integer> currentRow = matrixList.get(row);
            for (int i = col - range; i <= col + range; i++) {
                if (i >= 0 && i < currentRow.size()) {
                    currentRow.set(i, -1);
                }
            }
            matrixList.set(row, currentRow.stream()
                    .filter(e -> e > 0).collect(Collectors.toList()));
            //remove range rows down
            for (int i = row + range; i > row; i--) {
                if (i < matrixList.size()) {
                    if (col < matrixList.get(i).size()) {
                        currentRow = matrixList.get(i);
                        currentRow.set(col, -1);
                        matrixList.set(i, currentRow.stream().filter(e -> e > 0).collect(Collectors.toList()));
                    }
                }
            }
            //remove range rows up
            for (int i = row - range; i < row; i++) {
                if (i >= 0 && i < matrixList.size()) {
                    if (col < matrixList.get(i).size()) {
                        currentRow = matrixList.get(i);
                        currentRow.set(col, -1);
                        matrixList.set(i, currentRow.stream().filter(e -> e > 0).collect(Collectors.toList()));

                    }
                }
            }

            command = scanner.nextLine();
        }
        printMatrix(matrixList);
    }

    private static void printMatrix(List<List<Integer>> matrixList) {
        for (List<Integer> integers : matrixList) {
            if (integers.isEmpty()) {
                continue;
            }
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
