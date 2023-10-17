package homeworks.homework13;

public class Homework1 {
    public static void main(String[] args) {
        happyNumber();
    }

    public static void happyNumber() {
        for (int digit = 0; digit <= 10; digit++) {
            if (digit == 3) {
                System.out.print("Вот счастливое число! " + digit);
                break;
            }
        }
    }
}
