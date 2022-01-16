package day14MapsLambdaStreamApiLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] inputNumbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> counts = new TreeMap<>();
        for (double inputNumber : inputNumbers) {
            if (counts.containsKey(inputNumber)) {
                counts.put(inputNumber, counts.get(inputNumber) + 1);
            } else {
                counts.put(inputNumber, 1);
            }
        }
        DecimalFormat df = new DecimalFormat("#,#######");
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%s -> %d\n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
