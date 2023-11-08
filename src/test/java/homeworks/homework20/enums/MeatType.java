package homeworks.homework20.enums;

public enum MeatType {
    ГОВЯДИНА(15.00),
    КУРИЦА(10.00),
    РЫБА(20.00);
    private double price;

    MeatType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
