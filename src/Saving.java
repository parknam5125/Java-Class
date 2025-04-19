
public class Saving {
    private double balance;
    public static double interestRate = 0;
    public static int numberOfAccounts = 0;
    public Saving(){
        balance = 0;
        numberOfAccounts++;
    }
    public static void setInterestRate(double rate){
        interestRate = rate;
    }
    public static double getInterestRate(){
        return interestRate;
    }
    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
            return;
        }
        balance -= amount;
    }
    public double addInterest(){
        double interest = balance * interestRate;
        balance += interest;
        return interest;
    }
    public double getBalance(){
        return balance;
    }
    public static void showBalance(Saving account){
        System.out.println("Account balance: " + account.getBalance());
    }
}
