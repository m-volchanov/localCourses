package homeworks.homework12;

public class Homework1 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int digit = 9;
        int[] changedArray = changedArray(firstArray, digit);
        for (int first = 0; first < changedArray.length; first++) {
            System.out.print(changedArray[first] + " ");
        }
    }

    public static int[] changedArray(int[] Array, int num) {
        int[] newArray = new int[Array.length + 1];
        for (int second = 0; second < Array.length; second++) {
            newArray[second] = Array[second];
        }
        newArray[Array.length] = num;
        return newArray;
    }
}
