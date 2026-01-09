package seisprimeiros;

import java.util.Scanner;

public class aCalculatorProgram {
    static void main(String[] args){

        Scanner calculadora = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validoperation = true;

        System.out.println("Enter an operator (+, -, *, / or ^ ) to [plus, minus, times, division or Give in Power]: ");
        operator = calculadora.next().charAt(0);

        System.out.print("Enter the first number: ");
        num1 = calculadora.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = calculadora.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot be divided by Zero, try again with another number.");
                    validoperation = false;
                } else {
                    result = num1 / num2;
                }
            }

            default -> {
                System.out.println("Invalid operator!");
                validoperation = false;
            }
        }

        if(validoperation){
            System.out.println("the result of your operation is: " + result);
        }

        calculadora.close();
    }
}
