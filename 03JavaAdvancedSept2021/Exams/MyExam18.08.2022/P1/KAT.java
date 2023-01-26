import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> platesQue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .forEach(e -> platesQue.offer(Integer.parseInt(e)));
        ArrayDeque<Integer> carsStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .forEach(e -> carsStack.push(Integer.parseInt(e)));

        int days = 0;
        int registeredCars = 0;
        while (!platesQue.isEmpty() && !carsStack.isEmpty()) {
            days++;
            int currentPlates = platesQue.poll();
            int currentCars = carsStack.pop();
            int platesNeeded = currentCars * 2;
            if (platesNeeded == currentPlates) {
                registeredCars += currentCars;

            } else if (platesNeeded > currentPlates) {
                int registered = currentPlates / 2;
                registeredCars += registered;
                carsStack.push(currentCars - registered);

            } else if (currentPlates > platesNeeded) {
                int platesLeft = currentPlates - platesNeeded;
                registeredCars += currentCars;
                platesQue.offer(platesLeft);

            }
        }
        System.out.printf("%d cars were registered for %d days!\n", registeredCars, days);
        if (!platesQue.isEmpty()) {
            int sum = platesQue.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum + " license plates remain!");
        }
        if (!carsStack.isEmpty()) {
            int sum = carsStack.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum + " cars remain without license plates!");
        }
        if (platesQue.isEmpty() && carsStack.isEmpty()) {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
    }
}
