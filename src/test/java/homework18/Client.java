package homework18;

abstract class Client {
    protected double balance;

    public Client(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdrawal(double amount);

    public void displayAccountInfo() {
        System.out.println("Balance: " + balance);
    }
}
