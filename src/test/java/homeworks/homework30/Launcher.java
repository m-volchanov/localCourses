package homeworks.homework30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Launcher {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 22));
        personList.add(new Person("Charlie", 28));
        personList.add(new Person("David", 26));


        List<Person> sortedPeople = personList.stream()
                .filter(person -> person.getAge() > 25)
                .collect(Collectors.toList());

        sortedPeople.sort(Comparator.comparing(Person::getName));

        List<String> nameAndAge = sortedPeople.stream()
                .map(person -> person.getName() + " - " + person.getAge())
                .collect(Collectors.toList());

        nameAndAge.forEach(System.out::println);
    }
}
