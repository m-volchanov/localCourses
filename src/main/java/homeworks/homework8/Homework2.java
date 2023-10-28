package homeworks.homework8;

public class Homework2 {

    public static void main(String[] args) {
        middleSum();
    }

    public static void middleSum() {
        int[] numbers = new int[10];
        for (int randomDigit = 0; randomDigit < 10; randomDigit++) {
            numbers[randomDigit] = (int) ((Math.random() * 11) + 10);
            System.out.print(numbers[randomDigit] + " ");
        }
        System.out.println();

        double digitSum = 0;
        for (double digit : numbers) {
            digitSum += digit;
        }
        System.out.println("Среднее арифмитическое равно: " + digitSum / numbers.length);
    }
}
