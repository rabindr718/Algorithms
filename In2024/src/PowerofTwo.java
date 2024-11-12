import java.util.Scanner;
public class PowerofTwo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number =input.nextInt();
		if((number & number-1)==0) 
		{
			System.out.println("****");
//			System.out.println(number+" : Line 2");
//			System.out.println(number-1+" : Line 2");
//			System.out.println("Power of 2 ");
//			System.out.println((number & number-1));
		}
		else 
//			System.out.println(number+" : Line 2");
//			System.out.println(number-1+" : Line 2");
			System.out.println("NOT Power of 2...");
	}

}
