package day15MapsLambdaAndStreamApiExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P5SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> users = new LinkedHashMap<>();

        int numOfInput = Integer.parseInt(scanner.nextLine());

        for (int line = 1; line <= numOfInput; line++) {
            String inputData = scanner.nextLine();
            String user = inputData.split(" ")[1];
            if (inputData.split(" ")[0].equals("register")) {
                if(users.containsKey(user)) {
                    System.out.println("ERROR: already registered with plate number " + users.get(user));
                } else {
                    users.put(user, inputData.split(" ")[2]);
                    System.out.printf("%s registered %s successfully\n", user, users.get(user));
                }
            } else {
                if (!users.containsKey(user)) {
                    System.out.printf("ERROR: user %s not found\n", user);
                } else {
                    users.remove(user);
                    System.out.println(user + " unregistered successfully");
                }
            }
        }
        users.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
