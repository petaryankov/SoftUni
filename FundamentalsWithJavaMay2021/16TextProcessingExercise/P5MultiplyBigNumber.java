package day17TextProcessingExercise;

import java.util.Scanner;

public class P5MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
            while (input.charAt(0) == '0') {
                if (input.length() == 1) {
                    break;
                }
                input = input.substring(1);
        }
        int secondNum = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        int reminder = 0;
        if (secondNum > 0) {

            for (int i = input.length() - 1; i >= 0; i--) {
                char symbol = input.charAt(i);
                int symbolToNumber = Integer.parseInt(Character.toString(symbol));

                int calculate = symbolToNumber * secondNum + reminder;
                if (calculate > 9) {
                    if (i == 0) {
                        result.insert(0, calculate);
                        break;
                    }
                    reminder = calculate / 10;
                    int currentNum = calculate % 10;
                    result.insert(0, currentNum);
                } else {
                    result.insert(0, calculate);
                    reminder = 0;
                }
            }
        }
        else {
            result.append(0);
        }
        System.out.println(result);
    }
}
