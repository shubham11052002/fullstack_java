import java.util.Scanner;

public class countsdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);
        int count = numberString.length();
        System.out.println("The count of digits is: " + count);
        scanner.close();
    }
}
