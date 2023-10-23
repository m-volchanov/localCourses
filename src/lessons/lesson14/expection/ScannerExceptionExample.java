package lessons.lesson14.expection;

import java.util.Scanner;

public class ScannerExceptionExample {
    public static void main(String[] args) {
        example3();
    }

    public static void example3() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {
            System.out.println(arr[in] / 0);
        } catch (Exception e) {
            System.err.println("Что то пошло не так");
        }
        System.out.println("Программа продолжает свою работу");
    }

    public static void example2() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {
            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.err.println("Что то пошло не так");
        }
        System.out.println("Программа продолжает свою работу");
    }

    public static void example1() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {
            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Недопустимый элемент массива");
        } catch (ArithmeticException a) {
            System.err.println("На 0 делить нельзя");
        }
        System.out.println("Программа продолжает свою работу");
    }
}
