public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000, 500);
        System.out.println("Checking balance: " + account1.getCheckingBalance()); // should print 1000.0
        System.out.println("Savings balance: " + account1.getSavingsBalance()); // should print 500.0

        account1.deposit(200, "checking");
        System.out.println("Checking balance: " + account1.getCheckingBalance()); // should print 1200.0
        System.out.println("Total money: " + account1.getTotalMoney()); // should print 1700.0

        account1.withdraw(150, "savings");
        System.out.println("Savings balance: " + account1.getSavingsBalance()); // should print 350.0
        System.out.println("Total money: " + account1.getTotalMoney()); // should print 1550.0

        BankAccount account2 = new BankAccount(500, 1000);
        System.out.println("Number of accounts: " + BankAccount.getNumAccounts()); // should print 2
        System.out.println("Total money: " + BankAccount.getTotalMoney()); // should print 3050.0
    }
}
