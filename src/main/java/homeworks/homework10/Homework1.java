package homeworks.homework10;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        replaceEvenNumbers();
        System.out.println();
        replaceEvenNumbersVariantAlex();
    }

    public static void replaceEvenNumbers() {
        int[] numbers = new int[10];

        for (int simpleDigit = 0; simpleDigit < numbers.length; simpleDigit++) {
            numbers[simpleDigit] = simpleDigit + 1;
        }
        String[] finalDigit = new String[10];

        for (int simpleDigit = 0; simpleDigit < numbers.length; simpleDigit++) {
            if (numbers[simpleDigit] % 2 == 0) {
                finalDigit[simpleDigit] = "Y";
            } else {
                finalDigit[simpleDigit] = String.valueOf(numbers[simpleDigit]);
            }
        }
        for (String letter : finalDigit) {
            System.out.print(letter + " ");
        }
    }
    public static void replaceEvenNumbersVariantAlex(){
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for(int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(array[i]);
            if (number % 2 == 0) {
                array[i] = "Y";
            }
        }
        for(String str : array) {
            System.out.print(str + " ");
        }
    }
}
