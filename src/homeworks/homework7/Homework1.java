package homeworks.homework7;

public class Homework1 {
    public static void main(String[] args) {
        bigestNumber();
    }

    public static void bigestNumber() {
        int[] numbers = new int[8];
        for (int randomDigit = 0; randomDigit < 8; randomDigit++) {
            numbers[randomDigit] = (int) (Math.random() * 101);
            System.out.print(numbers[randomDigit] + " ");
        }
        System.out.println();

        int topNumber = numbers[0];
        for (int topDigit = 0; topDigit < 8; topDigit++) {
            if (numbers[topDigit] > topNumber) {
                topNumber = numbers[topDigit];
            }
        }
        System.out.println("Самое большое из 8 число: " + topNumber);
    }
}
