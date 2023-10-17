import java.util.Scanner;

public class didgitsum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
         int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
             sum += digit;
             number /= 10;
        }
        System.out.println("The sum of digits is: " + sum);
        scanner.close();
    }
}

