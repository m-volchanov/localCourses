package lessons.lesson4;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
switchCondition();
    }

    public static void switchCondition() {
        System.out.println("Введите число на выбор: 1,2 или 3");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch(num) {
            case 1:
                System.out.println("Введенное число 1");
                break;
            case 2:
                System.out.println("Введенное число 2");
                break;
            case 3:
                System.out.println("Введенное число 3");
                break;
            default:
                System.out.println("Вы ввели число не равное 1,2 или 3");
        }

    }

    public static void simpleCondition(String[] args) {
        System.out.println("Введите число на выбор:1,2 или 3");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Вы ввели число 1");
        } else if (num == 2) {
            System.out.println("Вы ввели число 2");
        } else if (num == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1,2 или 3");
        }
    }
}
