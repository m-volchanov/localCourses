package homeworks.homework5;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {
        workWithStars();
    }

    public static void workWithStars() {
        String[][] stars = new String[3][5];
        for (int row = 0; row < stars.length; row++) {
            for (int column = 0; column < stars[0].length; column++) {
                stars[row][column] = "*";
                System.out.print(" " + stars[row][column] + " ");
            }
            System.out.println();
        }
    }
}