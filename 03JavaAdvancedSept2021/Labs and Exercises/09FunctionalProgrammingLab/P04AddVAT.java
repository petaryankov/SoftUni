package day9.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P4AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] doubles = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble).toArray();
        UnaryOperator<Double> addVat = e -> e * 1.2;
        System.out.println("Prices with VAT:");
        Arrays.stream(doubles).forEach(e ->
                System.out.printf("%.2f\n",addVat.apply(e)));
    }
}
