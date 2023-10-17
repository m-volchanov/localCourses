package lessons.lesson5;

public class StringMethods {
    public static void main(String[] args) {
        lengthMethod();
        concatMethod();
        trimMethod();
        endWithMethod();
        caseMethod();
        equalsMethod();
        containsMethod();
        charAtMethod();
        toCharArrayMethod();
        indexOfMethod();
        substringMethod();
        replaceMethod();
    }

    public static void replaceMethod() {
        String str = "My name is Alex";
        String replaceStr = str.replace("Alex", "Maks");
        System.out.println(replaceStr);
    }

    public static void substringMethod() {
        String str = "My name is Alex";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 7));
    }

    public static void indexOfMethod() {
        String str = "My name is Alex";
        System.out.println(str.indexOf('M'));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("Alex"));
        System.out.println(str.indexOf("rvrve"));
    }

    public static void toCharArrayMethod() {
        String str = "My name is Alex";
        char[] result = str.toCharArray();

        for (Character r: result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    public static void charAtMethod() {
        String str = "My name is Alex";
        char result = str.charAt(4);
        System.out.println(result);
    }
    public static void containsMethod() {
        String str = "My name is Alex";
        String str2 = "Alex";
        boolean resultOfContains = str.contains(str2);
        System.out.println(resultOfContains);
    }

    public static void equalsMethod() {
        String str = "My name is Alex";
        String str2 = "My name is Alex";
        boolean resultOfCompare = str.equals(str2);
        System.out.println(resultOfCompare);
    }

    public static void caseMethod() {
        String str = "My Name Is Alex";
        String toUpper = str.toUpperCase();
        String toLower = str.toLowerCase();

        System.out.println(toUpper);
        System.out.println(toLower);
    }

    public static void endWithMethod() {
        String str = "My name is Alex";
        boolean ends1 = str.endsWith("Alex");
        boolean ends2 = str.endsWith("Maks");

        System.out.println(ends1);
        System.out.println(ends2);
    }

    public static void trimMethod() {
        String str = "      My name is Alex    ";
        String str2 = "      My name is Alex    ";
        System.out.println(str.trim());
        System.out.println(str2);
    }

    public static void concatMethod() {
        String text1 = "Hello ";
        String text2 = "world ";
        String result = text1.concat(text2);
        System.out.println(result);
    }

    public static void lengthMethod() {
        String name =  "Alex Alex";
        System.out.println(name.length());
    }
}