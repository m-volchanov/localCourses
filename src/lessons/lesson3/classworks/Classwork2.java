package lessons.lesson3.classworks;

import java.util.Scanner;

public class Classwork2 {

    public static void main(String[] args) {

        user();
    }

    public static void user() {
        System.out.println("Введите число 1:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }


    }
}
