package lessons.lesson14.expection;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchExample {

    public static void main(String[] args) throws IOException {
        readSomethingWithThrows();
    }

    public static void readSomethingWithThrows() throws IOException {
        FileWriter fileWriter = new FileWriter("somefile.txt");
        fileWriter.close();
        fileWriter.write("some");
        System.out.println("Программа работает дальше");
    }

    public static void readSomething() {
        try {
            FileWriter fileWriter = new FileWriter("somefile.txt");
            fileWriter.close();
            fileWriter.write("some");
        } catch (IOException e) {
            System.err.println("Чувак открой поток");
        } finally {
            System.out.println("Я выполнюсь всегда");
        }
        System.out.println("Программа работает дальше");
    }
}
