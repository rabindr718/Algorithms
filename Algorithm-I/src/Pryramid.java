import java.util.Scanner;
public class Pryramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        printNumericPyramid(rows);
		System.out.println(rows);
    }

    public static void printNumericPyramid(int rows) {
        int maxDigits = String.valueOf(rows).length();
		System.out.print(maxDigits);
        for (int i = 1; i <= rows; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                String num = String.format("%0" + maxDigits + "d", j);
                row.append(num).append(" ");
            }
            System.out.println(centerAlign(row.toString().trim(), maxDigits * rows));
        }
    }

    public static String centerAlign(String text, int width) {
        int padding = Math.max(0, width - text.length());
        return String.format("%" + (padding / 2 + text.length()) + "s", text);
    }
}
