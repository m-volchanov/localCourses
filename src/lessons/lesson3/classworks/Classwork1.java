package lessons.lesson3.classworks;

import java.util.Scanner;

public class Classwork1 {

    public static void main(String[] args) {
        System.out.println("Введите два целых числа");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Введите Ваше имя: ");
        String name = scanner.next();

        int result = number1 + number2;
        System.out.println(name + " " + result);
    }

}
