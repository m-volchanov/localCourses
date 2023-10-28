package homeworks.homework4;

public class Homework1 {
    public static void main(String[] args) {
        homework1();
    }

    public static void homework1() {
        int num = 1;
        while (num <= 512) {
            System.out.print(num + " ");
            num *= 2;
        }
    }
}
