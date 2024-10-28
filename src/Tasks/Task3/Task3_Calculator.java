package Tasks.Task3;

public class Task3_Calculator {
    public static void main(String[] args)
    {
        Calculator calculatorWithoutParameters = new Calculator();
        System.out.println(calculatorWithoutParameters.sum(5,6));
        System.out.println(calculatorWithoutParameters.diff(75,54));

        Calculator calculatorWithParameters = new Calculator(10, 5);
        calculatorWithParameters.multiply();
        calculatorWithParameters.div();
    }
}
