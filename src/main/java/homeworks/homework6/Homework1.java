package homeworks.homework6;

public class Homework1 {
    public static void main(String[] args) {
        workWithPyramid();
    }

    public static void workWithPyramid() {
        for (int row = 1; row <= 5; row++) {
            for (int space = 5; space >= row; space--) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
