package day10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P8AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());
        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("3:1")) {
            if (input[0].equals("merge")) {
                int startIndex = Integer.parseInt(input[1]);
                int endIndex = Integer.parseInt(input[2]);
                merge(list, startIndex, endIndex);
            } else if (input[0].equals("divide")) {
                int index = Integer.parseInt(input[1]);
                int divideString = Integer.parseInt(input[2]);
                if (index >= 0 && index <= list.size() - 1) {
                    divide(list, index, divideString);
                }
            }

            input = scanner.nextLine().split(" ");
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", " ")
                .replaceAll("\\s+", " ").trim());
    }

    private static void divide(List<String> list, int index, int divideString) {
        String stringIndexOfList = list.get(index);
        int stringSymbols = stringIndexOfList.length() / divideString;
        int startIndex = 0;
        for (int i = 1; i <= divideString; i++) {
            StringBuilder currentString = new StringBuilder();
            if (i == 1) {
                list.remove(index);
                startIndex = stringIndexOfList.length() - stringSymbols;
            } else {
                startIndex -= stringSymbols;
            }
            int endIndex = startIndex + stringSymbols;
            if (stringIndexOfList.length() % 2 != 0 && i == 1) {
                startIndex--;
            }
            for (int j = startIndex; j < endIndex; j++) {
                currentString.append(stringIndexOfList.charAt(j));
            }
            list.add(index, currentString.toString());
        }
    }

    private static void merge(List<String> list, int startIndex, int endIndex) {
        StringBuilder concatenate = new StringBuilder();
        if (startIndex > list.size() - 1) {
            return;
        } else if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i <= endIndex; i++) {
            if (i > list.size() - 1) {
                break;
            }
            concatenate.append(list.get(i));
            list.remove(i);
            list.add(i, (""));
        }
        list.add(startIndex, concatenate.toString());
        while (list.contains("")) {
            list.remove("");
        }
    }
}
