package day8MethodsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P11ArrayManipulator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commands = command.split(" ");
            String firstCommand = commands[0];
            switch (firstCommand) {
                //splits the array after the given index and exchanges the places of the two resulting subarrayс
                // E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
                //If the index is outside the boundaries of the array, print "Invalid index".
                case "exchange":
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index < numbers.size()) {
                        exchangeArray(numbers, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String maxEvenOrOdd = commands[1];
                    printMaxOddOrEvenIndex(numbers, maxEvenOrOdd);
                    break;
                case "min":
                    String minEvenOrOdd = commands[1];
                    printMinOddOrEvenIndex(numbers, minEvenOrOdd);
                    break;
                case "first":
                    int firstCount = Integer.parseInt(commands[1]);
                    String firstOddEven = commands[2];
                    printFirstCountOddEven(numbers, firstCount, firstOddEven);

                    break;
                case "last":
                    int lastCount = Integer.parseInt(commands[1]);
                    String lastOddEven = commands[2];
                    printLastCountOddEven(numbers, lastCount, lastOddEven);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(numbers);
    }

    private static void printLastCountOddEven(List<Integer> array, int lastCount, String lastOddEven) {
        boolean isValidCount = true;
        List<Integer> oddEvenNumbers = new ArrayList<>();
        int counter = 0;
        if (lastCount <= 0 || lastCount > array.size()) {
            isValidCount = false;
        } else if (lastOddEven.equals("odd")) {
            for (int i = array.size() - 1; i >= 0; i--) {
                if (array.get(i) % 2 != 0) {
                    counter++;
                    oddEvenNumbers.add(array.get(i));
                    if (counter == lastCount) {
                        break;
                    }
                }
            }
        } else if (lastOddEven.equals("even")) {
            for (int i = array.size() - 1; i >= 0; i--) {
                if (array.get(i) % 2 == 0) {
                    counter++;
                    oddEvenNumbers.add(array.get(i));
                    if (counter == lastCount) {
                        break;
                    }
                }
            }
        }
        if (isValidCount) {
            Collections.reverse(oddEvenNumbers);
            System.out.println(oddEvenNumbers);
        } else {
            System.out.println("Invalid count");
        }
    }

    private static void printFirstCountOddEven(List<Integer> array, int firstCount, String firstOddEven) {
        boolean isValidCount = true;
        List<Integer> oddEvenNumbers = new ArrayList<>();
        int counter = 0;
        if (firstCount <= 0 || firstCount > array.size()) {
            isValidCount = false;
        } else if (firstOddEven.equals("odd")) {
            for (Integer number : array) {
                if (number % 2 != 0) {
                    counter++;
                    oddEvenNumbers.add(number);
                    if (counter == firstCount) {
                        break;
                    }
                }
            }
        } else if (firstOddEven.equals("even")) {
            for (Integer number : array) {
                if (number % 2 == 0) {
                    counter++;
                    oddEvenNumbers.add(number);
                    if (counter == firstCount) {
                        break;
                    }
                }
            }
        }
        if (isValidCount) {
            System.out.println(oddEvenNumbers);
        } else {
            System.out.println("Invalid count");
        }
    }

    private static void printMinOddOrEvenIndex(List<Integer> array, String minEvenOrOdd) {
        int minNumber = Integer.MAX_VALUE;
        boolean isMatch = false;
        if (minEvenOrOdd.equals("odd")) {
            for (Integer number : array) {
                if (number % 2 != 0) {
                    isMatch = true;
                    if (number <= minNumber) {
                        minNumber = number;
                    }
                }
            }
        } else if (minEvenOrOdd.equals("even")) {
            for (Integer number : array) {
                if (number % 2 == 0) {
                    isMatch = true;
                    if (number <= minNumber) {
                        minNumber = number;
                    }
                }
            }
        }
        if (isMatch) {
            System.out.println(array.indexOf(minNumber));
        } else {
            System.out.println("No matches");
        }
    }

    private static void printMaxOddOrEvenIndex(List<Integer> array, String maxEvenOrOdd) {
        int maxNumber = Integer.MIN_VALUE;
        if (maxEvenOrOdd.equals("odd")) {
            for (Integer number : array) {
                if (number % 2 != 0) {
                    if (number > maxNumber) {
                        maxNumber = number;
                    }
                }
            }
        } else if (maxEvenOrOdd.equals("even")) {
            for (Integer number : array) {
                if (number % 2 == 0) {
                    if (number > maxNumber) {
                        maxNumber = number;
                    }
                }
            }
        }
        System.out.println(array.indexOf(maxNumber));
    }

    private static void exchangeArray(List<Integer> array, int index) {
        int iteration = index + 1;
        for (int i = 0; i < iteration; i++) {
            array.add(array.get(0));
            array.remove(array.get(0));
        }
    }

}
