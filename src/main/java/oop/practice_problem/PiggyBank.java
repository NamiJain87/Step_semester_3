package main.java.oop.practice_problem;

public class PiggyBank {

    private double savings;
    private final int bankId;

    public PiggyBank(int bankId) {
        this.bankId = bankId;
        savings = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings = savings + amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > savings) {
            return false;
        }

        savings = savings - amount;
        return true;
    }

    public double getSavings() {
        return savings;
    }

    public int getBankId() {
        return bankId;
    }

    public static void main(String[] args) {

        PiggyBank bank = new PiggyBank(101);

        bank.deposit(500);
        System.out.println("Savings: " + bank.getSavings());

        boolean result = bank.withdraw(200);
        System.out.println("Withdrawal successful: " + result);

        System.out.println("Savings: " + bank.getSavings());

        // Excessive withdrawal
        result = bank.withdraw(500);
        System.out.println("Withdrawal successful: " + result);

        System.out.println("Final Savings: " + bank.getSavings());

    }
}