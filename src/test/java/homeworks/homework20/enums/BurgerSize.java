package homeworks.homework20.enums;

public enum BurgerSize {
    МАЛЕНЬКИЙ(20.00),
    СРЕДНИЙ(30.00),
    БОЛЬШОЙ(40.00);

    private double price;

    BurgerSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
