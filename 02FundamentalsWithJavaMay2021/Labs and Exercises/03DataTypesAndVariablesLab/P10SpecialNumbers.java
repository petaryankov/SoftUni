package day3DataTypesAndVariablesLab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        // inputNum = num of iterations
        for (int number = 1; number <= inputNum; number++) {
            int sumOfInputNum = 0;
            int currentNum = number;
            while (currentNum > 0) { // collecting the last digit until currentNum > 0
                sumOfInputNum += currentNum % 10;//take the last digit
                currentNum /= 10; // remove the last digit
            }//check if the number is special
            boolean isSpecial = (sumOfInputNum == 5 || sumOfInputNum == 7 || sumOfInputNum == 11);
            String trueOrFalse = "False";// if not special
            if (isSpecial) {
                trueOrFalse = "True";// if special
            }
            System.out.printf("%d -> %s\n", number, trueOrFalse);
        }
    }
}
