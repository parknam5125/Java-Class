public class SavingDemo {
    public static void main(String[] args) {
        
        Saving my= new Saving();
        Saving you= new Saving();
        my.setInterestRate(0.05);
        you.setInterestRate(0.05);
        System.out.println("Me:"+my.getBalance());
        System.out.println("You: "+you.getBalance());
        System.out.println();
        my.deposit(10.75);
        System.out.println("Me:"+my.getBalance());
        System.out.println("You: "+you.getBalance());
        System.out.println();
        you.deposit(75);
        System.out.println("Me:"+my.getBalance());
        System.out.println("You: "+you.getBalance());
        System.out.println();
        you.deposit(55);
        System.out.println("Me:"+my.getBalance());
        System.out.println("You: "+you.getBalance());
        System.out.println();
        you.withdraw(15.75);
        System.out.println("Me:"+my.getBalance());
        System.out.println("You: "+you.getBalance());
        System.out.println();
        you.addInterest();
        System.out.println("Me:"+my.getBalance());
        System.out.println("You: "+you.getBalance());
        System.out.println();
        System.out.println(Saving.numberOfAccounts);

    }
}
