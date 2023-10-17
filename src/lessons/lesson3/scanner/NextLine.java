package lessons.lesson3.scanner;

import java.util.Scanner;

public class NextLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Введите Вашу фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Ваше имя и Фамилия: " + name + " " + surname);
    }

}
