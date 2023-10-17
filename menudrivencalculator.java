import java.util.Scanner;

public class menudrivencalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Menu-Driven Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1/2/3/4): ");

        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                operator = '+';
                result = num1 + num2;
                break;

            case 2:
                operator = '-';
                result = num1 - num2;
                break;

            case 3:
                operator = '*';
                result = num1 * num2;
                break;

            case 4:
                operator = '/';
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;

            default:
                System.out.println("Invalid choice. Please select a valid operation.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

