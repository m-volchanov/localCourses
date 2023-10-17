package lessons.lesson3.conditional;

public class SimpleExample {

    public static void main(String[] args) {
dificult();
    }
    public static void dificult(){
        int num1 = 5;
        int num2 = 6;
        if  (num1 == num2){
            System.out.println("Числа не равны");
        } else if(num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if(num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
    public static void simple(){
       int num1 = 6;
       int num2 = 6;
       if (num1 != num2) {
            System.out.println("Числа равны");
       } else {
            System.out.println("Числа не равны");
       }
    }

}