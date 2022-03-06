package day11.DefiningClassesLab.BankAccount03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        BankAccount account;
        Map<Integer, BankAccount> accounts = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] commands = input.split("\\s+");
            String command = commands[0];
            switch (command) {
                case "Create":
                    account = new BankAccount();
                    accounts.put(account.getId(), account);
                    System.out.printf("Account ID%d created\n", account.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(commands[1]);
                    double balance = Double.parseDouble(commands[2]);
                    printDeposit(accounts, id, balance);
                    break;

                case "SetInterest":
                    double newInterest = Double.parseDouble(commands[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    int idGetInterest = Integer.parseInt(commands[1]);
                    int years = Integer.parseInt(commands[2]);
                    printInterest(accounts, idGetInterest, years);
                    break;
            }

            input = scanner.nextLine();
        }
    }

    private static void printInterest(Map<Integer, BankAccount> accounts
            , int idGetInterest, int years) {
        if (!accounts.containsKey(idGetInterest)) {
            System.out.println("Account does not exist");
        } else {
            System.out.printf("%.2f\n", accounts.get(idGetInterest)
                    .getInterest(years));
        }
    }

    private static void printDeposit(Map<Integer, BankAccount> accounts
            , int id, double balance) {
        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
        } else {
            accounts.get(id).deposit(balance);
            System.out.printf("Deposited %.0f to ID%d\n", balance, id);
        }
    }
}
