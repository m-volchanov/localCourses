package homeworks.homework5;

public class Homework1 {
    public static void main(String[] args) {
        int lesser = lesserNumberMethod(10, 72);
        System.out.println(lesser);
    }

    public static int lesserNumberMethod(int lesser, int larger) {
        int lesserNum = 10;
        int largerNum = 72;
        return Math.min(lesserNum, largerNum);
    }
}
