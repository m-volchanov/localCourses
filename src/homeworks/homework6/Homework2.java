package homeworks.homework6;

public class Homework2 {
    public static void main(String[] args) {
        workAboutEducation();
    }

    public static void workAboutEducation() {
        int lesson = 3;
        for (int numberOfLessons = 1; numberOfLessons <= lesson; numberOfLessons++) {
            if (numberOfLessons < lesson) {
                System.out.println("Это " + numberOfLessons + "-й урок!");
                System.out.println("             Я выполнил все домашние задания " + numberOfLessons + "-го урока.");
            } else if (numberOfLessons == lesson) {
                System.out.println("Это " + numberOfLessons + "-й урок!");
                System.out.println("             Я не выполнил домашние задания " + numberOfLessons + "-го урока.");
            }
        }
    }
}
