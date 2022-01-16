package day2.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P2BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toPush = scanner.nextInt();
        int toPop = scanner.nextInt();
        int numberToCheck = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        //push in to the stack
        for (int i = 1; i <= toPush; i++) {
            stack.push(scanner.nextInt());
        }
        //pop from the stack
        for (int i = 1; i <= toPop; i++) {
            stack.pop();
        }
        //check if contains
        if (stack.contains(numberToCheck)) {
            System.out.println(true);
        } else {// if empty print 0
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {//print the smallest number
                System.out.println(Collections.min(stack));
            }
        }


    }
}
