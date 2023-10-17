package lessons.lesson14.expection;

import lessons.lesson12.finalExample.SomeClass;

public class LauncherForCustomException {
    public static void main(String[] args) {
        try {
            compute(11);
        } catch (CustomException e) {
            System.out.println(e);;
        }
    }

    public static void compute(int number) throws CustomException {
        System.out.println("compute метод вызван");
        if(number > 10) {
            throw new CustomException(number, "Some massage about Exception");
        }
        System.out.println("Нормальное завершение метода");
    }
}
