package homeworks.homework20.enums;

public enum Ingredient {
    СЫР(10.00),
    ПОМИДОР(5.00),
    САЛАТ(5.00),
    КОТЛЕТА(15.00);

    private double price;

    Ingredient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
