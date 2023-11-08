package homeworks.homework20.infoAboutBurger;

import homeworks.homework20.enums.BurgerSize;
import homeworks.homework20.enums.Ingredient;
import homeworks.homework20.enums.MeatType;

import java.util.List;

public class Burger {
    private BurgerSize burgerSize;
    private MeatType meatType;
    private List<Ingredient> ingredients;

    public Burger(BurgerSize burgerSize, MeatType meatType, List<Ingredient> ingredients) {
        this.burgerSize = burgerSize;
        this.meatType = meatType;
        this.ingredients = ingredients;
    }

    public double calculatePrice() {
        double price = burgerSize.getPrice() + meatType.getPrice();
        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }

    public void infoAboutBurger() {
        if (ingredients == null) {
            throw new NullPointerException("Ошибка: Ингредиенты не указаны.");
        }
        System.out.println("Размер бургера: " + burgerSize);
        System.out.println("Тип мяса: " + meatType);
        System.out.println("Ингридиенты: " + ingredients);
        System.out.println("Общая стоимость: " + calculatePrice() + " UAH");
    }
}
