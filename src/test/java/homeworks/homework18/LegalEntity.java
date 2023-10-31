package homeworks.homework18;

public class LegalEntity extends Client {
    public LegalEntity(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdrawal(double amount) {
        double commission = amount * 0.01;
        balance -= (amount + commission);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Legal Entity Account:");
        System.out.println("Deposit condition: No commission");
        System.out.println("Withdrawal condition: 1% commission");
        super.displayAccountInfo();
    }
}
