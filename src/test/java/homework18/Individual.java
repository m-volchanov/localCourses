package homework18;

public class Individual extends Client {
    public Individual(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdrawal(double amount) {
        balance -= amount;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Individual Account:");
        System.out.println("Deposit condition: No commission");
        System.out.println("Withdrawal condition: No commission");
        super.displayAccountInfo();
    }
}
