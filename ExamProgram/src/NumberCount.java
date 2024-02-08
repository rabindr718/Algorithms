import java.awt.print.Printable;
import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
    	// Number Will Give to Here
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the Number :");
        int N = scanner.nextInt(); 

        int countOdd = 0;
        int countEven = 0;
        int countComposite = 0;
        int countPrime = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            if (isComposite(i)) {
                countComposite++;
            } else {
                countPrime++;
            }
        }

        System.out.println("Odd numbers: " + countOdd);
        System.out.println("Even numbers: " + countEven);
        System.out.println("Composite numbers: " + countComposite);
        System.out.println("Prime numbers: " + countPrime);
    }

    public static boolean isComposite(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }

        return false;
    }
}
