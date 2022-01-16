package day14MapsLambdaStreamApiLab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P5Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        Arrays.stream(input).map(Integer::parseInt)
                .sorted(Comparator.reverseOrder()).limit(3)
                .forEach(e -> System.out.printf("%d ", e));
    }
}
