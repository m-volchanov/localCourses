package homeworks.homework20.infoAboutBurger;

import homeworks.homework20.enums.BurgerSize;

import java.util.Scanner;

public class ChooseBurgerSize {
    public static BurgerSize chooseBurgerSize(Scanner scanner) {
        BurgerSize selectedSize = null;

        System.out.println("Выберите размер бургера:");
        while (selectedSize == null) {
            for (BurgerSize size : BurgerSize.values()) {
                System.out.println(size.name() + " - " + size.getPrice() + " UAH");
            }

            String sizeBurgerInput = scanner.next().toUpperCase();
            try {
                selectedSize = BurgerSize.valueOf(sizeBurgerInput);
                if (selectedSize == null) {
                    System.out.println("Ошибка: Неверный размер бургера. Попробуйте еще раз.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: Неверный размер бургера. Попробуйте еще раз.");
                selectedSize = null;
            }
        }
        return selectedSize;
    }
}
