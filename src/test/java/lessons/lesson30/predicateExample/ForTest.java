package lessons.lesson30.predicateExample;

import java.util.function.Predicate;

public class ForTest {
    public static void main(String[] args) {
        MyPredicate myPredicate = new MyPredicate() {
            @Override
            public boolean test(Integer value) {
                return value > 0;
            }
        };
        System.out.println(myPredicate.test(5));

        MyPredicate myPredicate1 = value -> value > 0;
        System.out.println(myPredicate.test(10));
        System.out.println(myPredicate.test(-1));
        System.out.println(myPredicate.test(0));
        System.out.println(myPredicate.test(8));

        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(3));
    }
}