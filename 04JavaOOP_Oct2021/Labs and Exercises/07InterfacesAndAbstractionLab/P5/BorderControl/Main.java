package day7.InterfacesAndAbstractionLab.P5.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> identifiables = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                Identifiable identifiable = new Citizen(name, age, id);
                identifiables.add(identifiable);
            } else {
                String model = tokens[0];
                String id = tokens[1];
                Identifiable identifiable = new Robot(model, id);
                identifiables.add(identifiable);
            }
            input = scanner.nextLine();
        }
        String number = scanner.nextLine();
        for (Identifiable identifiable : identifiables) {
            if (identifiable.getId().endsWith(number)) {
                System.out.println(identifiable.getId());
            }
        }
//        System.out.println(identifiables.stream().map(Identifiable::getId)
//                .filter(id -> id.endsWith(number))
//                .collect(Collectors.joining(System.lineSeparator())));
    }
}
