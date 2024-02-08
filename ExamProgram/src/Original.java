import java.util.Arrays;
import java.util.Scanner;

public class Original {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sides = new int[4];

        System.out.println("Enter the four side Lengths: ");

        for (int i = 0; i < 4; i++) {
            sides[i] = scanner.nextInt();
        }

        scanner.close();

        Arrays.sort(sides);

        if (sides[0] == sides[3]) {
            System.out.println("It is a square.");
        } else if (sides[0] == sides[2] && sides[1] == sides[3]) {
            System.out.println("It is a parallelogram.");
        } else if (sides[0] == sides[1] && sides[2] == sides[3]) {
            System.out.println("It is a rectangle.");
        } else {
            System.out.println("It is a quadrilateral.");
        }
    }
}
