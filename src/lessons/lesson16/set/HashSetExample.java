package lessons.lesson16.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetExample {

    static Set<String> mySet = new HashSet<>();

    public static void main(String[] args) {
        addMethodExample(mySet);
        removeMethodExample(mySet, "Alex");
        containsMethodExample(mySet, "Igor");
        containsMethodExample(mySet, "Elena");
        sizeMethodExample(mySet);
        clearMethodExample(mySet);
        isEmptyMethodExample(mySet);
        howGetSetExample(mySet, 0);
    }

    static void addMethodExample(Set<String> someSet) {
        someSet.add("Alex");
        someSet.add("Alex");
        someSet.add("Maks");
        someSet.add("Igor");
        System.out.println(someSet);
    }

    static void removeMethodExample(Set<String> someSet, String removeObject) {
        System.out.println("Before remove");
        System.out.println(someSet);
        someSet.remove(removeObject);
        System.out.println("After remove");
        System.out.println(someSet);
    }

    static void containsMethodExample(Set<String> someSet, String containsObject) {
        System.out.println("Set contains " + containsObject + " - " + someSet.contains(containsObject));
    }

    static void sizeMethodExample(Set<String> someSet) {
        System.out.println("Set size is " + someSet.size());
    }

    static void clearMethodExample(Set<String> someSet) {
        System.out.println("Set size is before clear " + someSet.size());
        someSet.clear();
        System.out.println("Set size is after clear " + someSet.size());
    }

    static void isEmptyMethodExample(Set<String> someSet) {
        System.out.println("Is set empty? " + someSet.isEmpty());
        addMethodExample(someSet);
        System.out.println("Is set empty? " + someSet.isEmpty());
    }

    static void howGetSetExample(Set<String> someSet, int element) {
        List<String> myList = new ArrayList<>(someSet);
        System.out.println("This value from set " + myList.get(element));
    }
}

