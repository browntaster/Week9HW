package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        char choice;
        do {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            System.out.println("Please enter one of the symbol +,-,/,* : ");
            char symbol = sc.next().charAt(0);

           // calculator.calculatorResult(num1, num2, symbol);

            System.out.println("Would you like to do more calculation please enter 'Y' or 'N' " );
            choice = sc.next().charAt(0);
        } while (choice=='Y');

        sc.close();
        System.out.println("Thank you for using calculator!");
    }
}
