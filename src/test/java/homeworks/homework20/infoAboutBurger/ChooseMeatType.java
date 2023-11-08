package homeworks.homework20.infoAboutBurger;

import homeworks.homework20.enums.MeatType;

import java.util.Scanner;

public class ChooseMeatType {
    public static MeatType chooseMeatType(Scanner scanner) {
        MeatType selectedMeat = null;

        System.out.println("Выберите тип мяса:");
        while (selectedMeat == null) {
            for (MeatType meatType : MeatType.values()) {
                System.out.println(meatType.name() + " - " + meatType.getPrice() + " UAH");
            }

            String meatTypeInput = scanner.next().toUpperCase();
            try {
                selectedMeat = MeatType.valueOf(meatTypeInput);
                if (selectedMeat == null) {
                    System.out.println("Ошибка: Неверный тип мяса. Попробуйте еще раз.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: Неверный тип мяса. Попробуйте еще раз.");
                selectedMeat = null;
            }
        }
        return selectedMeat;
    }
}
