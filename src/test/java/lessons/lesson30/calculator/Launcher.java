package lessons.lesson30.calculator;

public class Launcher {
    public static void main(String[] args) {

        IOperation additional = (value1, value2) -> value1 + value2;

        Calculator calculator = new Calculator(additional);
        double additionalResult = calculator.performOperation(2, 2);
        System.out.println("Additing result = " + additionalResult);

        IOperation subtraction = (value1, value2) -> value1 - value2;
        calculator.setIOperation(subtraction);
        double subtractionResult = calculator.performOperation(10, 4);
        System.out.println("Subtraction result = " + subtractionResult);

    }
}
