package day5.SetsAndMapsAdvancedLab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P4CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> numbersMap = new LinkedHashMap();
        for (double number : numbers) {
            if (numbersMap.containsKey(number)) {
                numbersMap.put(number, numbersMap.get(number) + 1);
            } else {
                numbersMap.put(number, 1);
            }
        }
        numbersMap.forEach((key, value) -> System.out.printf("%.1f -> %d\n", key, value));
    }
}
