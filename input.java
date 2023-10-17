import java.util.Scanner;

public class input {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your roll no");
        int roll = scanner.nextInt();
        System.out.println("This is the roll no :" + roll);
        scanner.nextLine();
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("This is your name :" + name);
    }
}