package day4.EncapsulationExercises.P3.ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new LinkedHashMap<>();
        String[] personInput = scanner.nextLine().split(";");

        for (String personData : personInput) {
            String[] personInfo = personData.split("=");
            String personName = personInfo[0];
            int personMoney = Integer.parseInt(personInfo[1]);

            try {
                Person person = new Person(personName, personMoney);
                people.put(personName, person);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        Map<String, Product> products = new LinkedHashMap<>();
        String[] productInput = scanner.nextLine().split(";");

        for (String productData : productInput) {
            String[] productInfo = productData.split("=");
            String productName = productInfo[0];
            int productCost = Integer.parseInt(productInfo[1]);

            try {
                Product product = new Product(productName, productCost);
                products.put(productName, product);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] commands = command.split("\\s+");
            String name = commands[0];
            String productName = commands[1];
            try {
                Person person = people.get(name);
                Product product = products.get(productName);
                person.buyProduct(product);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }
        for (Person person : people.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                System.out.println(person.getProducts()
                        .stream().map(Product::getName).collect(Collectors.joining(", ")));
            }
        }
    }
}
