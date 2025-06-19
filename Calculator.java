import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        String operator;

        System.out.println("===== Simple Calculator =====");

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        input.close();
    }
}
