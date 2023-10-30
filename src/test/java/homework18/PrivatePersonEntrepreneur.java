package homework18;

public class PrivatePersonEntrepreneur extends Client {
    public PrivatePersonEntrepreneur(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        double commission = 0;
        if (amount < 1000) {
            commission = amount * 0.01;
        } else {
            commission = amount * 0.005;
        }
        balance += (amount - commission);
    }

    @Override
    public void withdrawal(double amount) {
        double commission = amount * 0.01;
        balance -= (amount + commission);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Private Person Entrepreneur Account:");
        System.out.println("Deposit condition: 1% commission if amount < 1000, 0.5% commission if amount > 1000");
        System.out.println("Withdrawal condition: 1% commission");
        super.displayAccountInfo();
    }
}
