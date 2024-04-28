package calculator;

public class Calculator {

    public void addition (int a, int b) {
        System.out.println("Addition of "+a+ " and "+b+" is "+(a+b));
    }

    public void subtraction (int a, int b) {
        System.out.println("Subtraction of "+a+ " and "+b+" is "+(a-b));
    }

    public void division (int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
        } else {
            System.out.println("Divison  of " + a + " and " + b + " is " + (double) a / b);
        }
    }

    public void multiplication (int a, int b) {
        System.out.println("Multiplication of"+ a + " and " + b + " is " + (double) a * b);
    }

    public void calculateResult (int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                break;
            case  '-':
                break;
            case '/':
                break;
            case '*':
                break;
            default:
                System.out.println("Invalid symbol entered!");
        }
    }


}
