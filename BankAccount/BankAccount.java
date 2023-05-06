public class BankAccount {
    private static int numAccounts = 0;
    private static double totalMoney = 0;
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numAccounts++;
        totalMoney += checkingBalance + savingsBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equals("checking")) {
            checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equals("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equals("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static int getNumAccounts() {
        return numAccounts;
        
    }
}
