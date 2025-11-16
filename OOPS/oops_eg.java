abstract class Account {
    private String holderName;  // Encapsulation
    private double balance;     // Encapsulation

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    //abstract  method -> Abstraction
    public abstract void calculateInterest();

    public double getBalance() {
        return balance;
    }

    public void deposit(double amout) {
        balance += amout;
    }

    protected void updateBalance(double amount) {
        this.balance += amount;
    }

    public String getHolderName() {
        return holderName;
    }
}

class SavingAccount extends Account {
    public SavingAccount(String holderName, double balance) {
        super(holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance()*0.05;
        updateBalance(interest);
        System.out.print("Savings interest added: "+ interest);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String holderName, double balance) {
        super(holderName, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }
}

public class oops_eg {
    public static void main(String[] args) {

        Account a1 = new SavingAccount("Baibhab", 10000.0);
        Account a2 = new CurrentAccount("Sai", 100.0);

        a1.calculateInterest();
        a2.calculateInterest();

        System.out.println(a1.getHolderName()+"'s balance"+ a1.getBalance());
        System.out.println(a2.getHolderName()+"'s balance"+ a2.getBalance());

    }
}
