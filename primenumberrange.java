import java.util.Scanner;

public class primenumberrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st stirng: ");
        int lowerBound = scanner.nextInt();
        System.out.print("last string: ");
        int upperBound = scanner.nextInt();
        scanner.close();

        System.out.println("Prime numbers in the range from " + lowerBound + " to " + upperBound + ":");
        printPrimesInRange(lowerBound, upperBound);
    }

    public static void printPrimesInRange(int lowerBound, int upperBound) {
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}

