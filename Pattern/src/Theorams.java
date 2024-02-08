import java.util.Scanner;

public class Theorams {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		double first;
		double second;
		System.out.println("Enter the First Number : ");
		first=scanner.nextDouble();
		System.out.println("Enter the Second Number : ");
		second=scanner.nextDouble();
		double result=Math.sqrt(first*first + second*second);
		System.out.println(result+" ");
	}

}
