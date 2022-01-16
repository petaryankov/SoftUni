package day19RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P3SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //For each valid line print on the console:
        // "{customerName}: {product} - {totalPrice}"
        //When you receive "end of shift" print the total
        // amount of money for the day rounded to 2 decimal
        // places in the following format: "Total income: {income}".

        String input = scanner.nextLine();
        String regex = "%(?<customerName>[A-Z][a-z]+)%[^|$%.]*" +
                "<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|" +
                "[^|$%.]*?(?<price>\\d+\\.?\\d+)\\$";

        double total = 0;
        while (!input.equals("end of shift")) {

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("customerName");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double productTotal = count * price;
                total += productTotal;
                System.out.printf("%s: %s - %.2f\n", name, product, productTotal);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", total);
    }
}
