package homeworks.homework20.infoAboutBurger;

import homeworks.homework20.enums.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChooseIngredients {
    public static List<Ingredient> chooseIngredients(Scanner scanner) {
        List<Ingredient> selectedIngredients = new ArrayList<>();
        while (true) {
            System.out.println("Добавьте ингридиент (введите 'ГОТОВО' для того чтобы подтвердить заказ):");
            String ingredientInput = scanner.next().toUpperCase();
            if (ingredientInput.equalsIgnoreCase("ГОТОВО")) {
                break;
            }
            try {
                Ingredient ingredient = Ingredient.valueOf(ingredientInput);
                selectedIngredients.add(ingredient);
            } catch (IllegalArgumentException e) {
                System.out.println("Не верный ингридиент, попробуйте еще раз.");
            }
        }
        return selectedIngredients;
    }
}
