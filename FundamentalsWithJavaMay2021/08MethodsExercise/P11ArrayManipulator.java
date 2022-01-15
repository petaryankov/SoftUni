package day8MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            if (command[0].equals("exchange")) {
                int commandIndex = Integer.parseInt(command[1]);
                //if index is valid exchange
                if (commandIndex >= 0 && commandIndex <= input.length) {
                    exchangeIndex(input, commandIndex);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command[0].equals("max")) {
                if (command[1].equals("even")) {
                    maxEven(input);
                } else if (command[1].equals("odd")) {
                    maxOdd(input);
                }
            } else if (command[0].equals("min")) {
                if (command[1].equals("even")) {
                    minEven(input);
                } else if (command[1].equals("odd")) {
                    minOdd(input);
                }
            } else if (command[0].equals("first")) {
                int count = Integer.parseInt(command[1]);
                if (command[2].equals("even")) {
                    firstEven(input, count);
                } else if (command[2].equals("odd")) {
                    firstOdd(input, count);
                }
            } else if (command[0].equals("last")) {
                int count = Integer.parseInt(command[1]);
                if (command[2].equals("even")) {
                    lastEven(input, count);
                } else if (command[2].equals("odd")) {
                    lastOdd(input, count);
                }
            }

            command = scanner.nextLine().split(" ");
            printArray(command, input);
        }

    }

    private static void lastOdd(int[] input, int count) {
        if (count > input.length) {
            System.out.println("Invalid count");
        } else {
            int counterOdd = 0;
            for (int index = input.length - 1; index >= 0; index--) {
                if (input[index] % 2 != 0) {
                    counterOdd++;
                }
                if (count == counterOdd) {
                    break;
                }
            }
            int[] lastOdd = new int[counterOdd];
            int revers = counterOdd - 1;

            for (int index = input.length - 1; index >= 0; index--) {
                if (revers < 0) {
                    break;
                }
                if (input[index] % 2 != 0) {
                    lastOdd[revers] = input[index];
                    revers--;
                }
            }
            System.out.print("[");
            for (int i = 0; i < lastOdd.length; i++) {
                if (i >= 1) {
                    System.out.print(", ");
                }
                System.out.printf("%d", lastOdd[i]);
            }
            System.out.println("]");
        }
    }

    private static void lastEven(int[] input, int count) {
        if (count > input.length) {
            System.out.println("Invalid count");
        } else {
            int counterOdd = 0;
            for (int index = input.length - 1; index >= 0; index--) {
                if (input[index] % 2 == 0) {
                    counterOdd++;
                }
                if (count == counterOdd) {
                    break;
                }
            }
            int[] lastOdd = new int[counterOdd];
            int revers = counterOdd - 1;

            for (int index = input.length - 1; index >= 0; index--) {
                if (revers < 0) {
                    break;
                }
                if (input[index] % 2 == 0) {
                    lastOdd[revers] = input[index];
                    revers--;
                }
            }
            System.out.print("[");
            for (int i = 0; i < lastOdd.length; i++) {
                if (i >= 1) {
                    System.out.print(", ");
                }
                System.out.printf("%d", lastOdd[i]);
            }
            System.out.println("]");
        }
    }

    private static void firstOdd(int[] input, int count) {
        if (count > input.length) {
            System.out.println("Invalid count");
        } else {
            int counterOdd = 0;
            System.out.print("[");
            for (int index = 0; index <= input.length - 1; index++) {
                if (input[index] % 2 != 0) {
                    if (counterOdd > 0) {
                        System.out.print(", ");
                    }
                    counterOdd++;
                    System.out.printf("%d", input[index]);
                }
                if (count == counterOdd) {
                    break;
                }
            }
            System.out.print("]" + "\n");
        }
    }

    private static void firstEven(int[] input, int count) {
        if (count > input.length) {
            System.out.println("Invalid count");
        } else {
            int counterEven = 0;
            System.out.print("[");
            for (int index = 0; index <= input.length - 1; index++) {
                if (input[index] % 2 == 0) {
                    if (counterEven > 0) {
                        System.out.print(", ");
                    }
                    counterEven++;
                    System.out.printf("%d", input[index]);
                }
                if (count == counterEven) {
                    break;
                }
            }
            System.out.print("]" + "\n");
        }
    }

    private static void minOdd(int[] input) {
        int minOdd = Integer.MAX_VALUE;
        boolean isOdd = false;
        int minOddIndex = 0;
        for (int index = 0; index <= input.length - 1; index++) {
            if (input[index] % 2 != 0) {
                isOdd = true;
                if (input[index] <= minOdd) {
                    minOdd = input[index];
                    minOddIndex = index;
                }
            }
        }
        if (isOdd) {
            System.out.println(minOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static void minEven(int[] input) {
        int minEven = Integer.MAX_VALUE;
        boolean isEven = false;
        int minEvenIndex = 0;
        for (int index = 0; index <= input.length - 1; index++) {
            if (input[index] % 2 == 0) {
                isEven = true;
                if (input[index] <= minEven) {
                    minEven = input[index];
                    minEvenIndex = index;
                }
            }
        }
        if (isEven) {
            System.out.println(minEvenIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static void printArray(String[] command, int[] input) {
        if (command[0].equals("end")) {
            System.out.print("[");
            for (int index = 0; index < input.length - 1; index++) {
                System.out.printf("%d, ", input[index]);
            }
            System.out.print(input[input.length - 1] + "]" + "\n");
        }
    }

    private static void maxOdd(int[] input) {
        int maxOdd = Integer.MIN_VALUE;
        boolean isOdd = false;
        int maxOddIndex = 0;
        for (int index = 0; index <= input.length - 1; index++) {
            if (input[index] % 2 != 0) {
                isOdd = true;
                if (input[index] >= maxOdd) {
                    maxOdd = input[index];
                    maxOddIndex = index;
                }
            }
        }
        if (isOdd) {
            System.out.println(maxOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static void maxEven(int[] input) {
        int maxEven = Integer.MIN_VALUE;
        boolean isEven = false;
        int maxEvenIndex = 0;
        for (int index = 0; index <= input.length - 1; index++) {
            if (input[index] % 2 == 0) {
                isEven = true;
                if (input[index] >= maxEven) {
                    maxEven = input[index];
                    maxEvenIndex = index;
                }
            }
        }
        if (isEven) {
            System.out.println(maxEvenIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static void exchangeIndex(int[] input, int commandOfIndex) {
        //1 2 3 4 5
        while (commandOfIndex >= 0) {
            int firstInt = input[0];
            System.arraycopy(input, 1, input, 0, input.length - 1);
            input[input.length - 1] = firstInt;
            commandOfIndex--;
        }
    }
}
