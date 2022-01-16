package day14MapsLambdaStreamApiLab;

import java.util.Arrays;
import java.util.Scanner;

public class P4WordFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] fruits = (scanner.nextLine().split(" "));
        Arrays.stream(fruits).filter(fruit -> fruit.length() % 2 == 0).forEach(System.out::println);
    }
}
