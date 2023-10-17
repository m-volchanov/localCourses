package homeworks.homework11;

import java.util.Scanner;

public class Homework1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = getInt();
        int secondNumber = getInt();
        char action = getAction();
        int result = calc(firstNumber, secondNumber, action);
        System.out.println("Решение: " + result);
    }

    public static int getInt() {
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        return number;
    }

    public static char getAction() {
        System.out.println("Введите действие: ");
        char action = scanner.next().charAt(0);
        return action;
    }

    public static int calc(int firstNumber, int secondNumber, char action) {
        int result;
        switch (action) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(firstNumber, secondNumber, getAction());
        }
        return result;
    }
}
