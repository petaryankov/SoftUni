package day15MapsLambdaAndStreamApiExercise;

import java.util.*;

public class P8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companies = new TreeMap<>();

        String inputData = scanner.nextLine();
        while (!inputData.equals("End")) {
            String companyName = inputData.split("->")[0];
            String employeeId = inputData.split("->")[1];
            companies.putIfAbsent(companyName, new ArrayList<>());
            if (!companies.get(companyName).contains(employeeId)) {
            companies.get(companyName).add(employeeId);
            }

            inputData = scanner.nextLine();
        }
        for (String company : companies.keySet()) {
            System.out.println(company.trim());
            for (int id = 0; id < companies.get(company).size(); id++) {
                System.out.println("-- " + companies.get(company).get(id).trim());
            }
        }
    }
}
