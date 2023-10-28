package homeworks.homework3;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        System.out.println("Введите число на выбор:1,2 или 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else if (number == 2) {
            System.out.println("Вы ввели число 2");
        } else if (number == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1,2 или 3");
        }
    }
}
