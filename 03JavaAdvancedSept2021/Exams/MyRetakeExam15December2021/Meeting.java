package MyRetakeExam15December2021;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> maleStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(maleStack::push);
        ArrayDeque<Integer> femaleQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(femaleQueue::offer);

        int matches = 0;
        while (maleStack.size() > 0 && femaleQueue.size() > 0) {
            int currentMale = maleStack.peek();
            int currentFemale = femaleQueue.peek();
            //•	If someone’s value is equal to or below 0, remove it
            if (currentMale <= 0) {
                maleStack.pop();
                continue;
            }
            if (currentFemale <= 0) {
                femaleQueue.poll();
                continue;
            }
            // you should remove him/her from the records before trying to match him/her with anybody.
            if (currentMale % 25 == 0) {
                maleStack.pop();
                if (maleStack.size() > 0) {
                    maleStack.pop();
                }
                continue;
            }
            if (currentFemale % 25 == 0) {
                femaleQueue.poll();
                if (femaleQueue.size() > 0) {
                    femaleQueue.poll();
                }
                continue;
            }
            //If their values are equal
            if (currentMale == currentFemale) {
                matches++;
                maleStack.pop();
                // Otherwise, you should remove only the female and decrease the value of the male by 2.
            } else {
                currentMale -= 2;
                maleStack.pop();
                maleStack.push(currentMale);
            }
            femaleQueue.poll();

        }
        System.out.println("Matches: " + matches);

        if (maleStack.size() > 0) {
            //If there are males: "Males left: {male1}, {male2}, {male3}, (…)"
            System.out.print("Males left: ");
            StringJoiner malesJoiner = new StringJoiner(", ");
            maleStack.forEach(e -> malesJoiner.add(e.toString()));
            System.out.println(malesJoiner);
        } else {
            System.out.println("Males left: none");
        }
        if (femaleQueue.size() > 0) {
            //If there are females: "Females left: {female1}, {female2}, (…)"
            System.out.print("Females left: ");
            StringJoiner femalesJoiner = new StringJoiner(", ");
            femaleQueue.forEach(e -> femalesJoiner.add(e.toString()));
            System.out.println(femalesJoiner);
        } else {
            System.out.println("Females left: none");
        }
    }
}
