package day11.DefiningClassesLab.BankAccount03;

public class BankAccount {
    private static int accountCount = 1;
    private int id;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount() {
        this.id = accountCount;
        accountCount++;
    }

    static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * years * balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }

}
