package homeworks.homework17;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        StudentComparatorByAverageGrade StudentByAverageGrade = new StudentComparatorByAverageGrade();
        TreeSet<Student> studentTreeSet =  new TreeSet<>(StudentByAverageGrade);
        studentTreeSet.add(new Student("Shevchenko", 8.1));
        studentTreeSet.add(new Student("Franko", 6.3));
        studentTreeSet.add(new Student("Kurbas", 10.7));
        studentTreeSet.add(new Student("Murashko", 4.2));
        studentTreeSet.add(new Student("Maksymovych", 11.6));

        for (Student car : studentTreeSet) {
            System.out.println(car);
        }
    }
}