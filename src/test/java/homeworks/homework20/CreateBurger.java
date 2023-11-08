package homeworks.homework20;

import homeworks.homework20.enums.BurgerSize;
import homeworks.homework20.enums.Ingredient;
import homeworks.homework20.enums.MeatType;
import homeworks.homework20.infoAboutBurger.Burger;
import homeworks.homework20.infoAboutBurger.ChooseBurgerSize;
import homeworks.homework20.infoAboutBurger.ChooseIngredients;
import homeworks.homework20.infoAboutBurger.ChooseMeatType;

import java.util.List;
import java.util.Scanner;

public class CreateBurger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в Одесскую Бургерную!");

        BurgerSize selectedSize = ChooseBurgerSize.chooseBurgerSize(scanner);
        MeatType selectedMeat = ChooseMeatType.chooseMeatType(scanner);
        List<Ingredient> selectedIngredients = ChooseIngredients.chooseIngredients(scanner);

        Burger burger = new Burger(selectedSize, selectedMeat, selectedIngredients);
        System.out.println("\nВаш бургер готов:");
        burger.infoAboutBurger();
    }
}
