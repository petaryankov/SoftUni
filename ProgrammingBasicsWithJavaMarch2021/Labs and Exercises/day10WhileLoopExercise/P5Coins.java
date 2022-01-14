package day10WhileLoopExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P5Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        change *= 100;
        int changeToInt = (int) change;
        int coins = 0;
        while (0 < changeToInt) {
            coins++;
            if (changeToInt >= 200) {
                changeToInt -= 200;
            } else if (changeToInt >= 100) {
                changeToInt -= 100;
            } else if (changeToInt >= 50) {
                changeToInt -= 50;
            } else if (changeToInt >= 20) {
                changeToInt -= 20;
            } else if (changeToInt >= 10) {
                changeToInt -= 10;
            } else if (changeToInt >= 5) {
                changeToInt -= 5;
            } else if (changeToInt >= 2) {
                changeToInt -= 2;
            } else if (changeToInt >= 1) {
                changeToInt -= 1;
            }
        }
        System.out.println(coins);
    }
}
