package basic;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		int number=inputScanner.nextInt();		
		int reverse=0;
		while(number!=0) {
			System.out.println("checked condition : " + number);
			int digit =number %10;
//			System.out.println("after 10 mode condition : " + digit);
			reverse=reverse * 10 + digit;
			number/=10;
			System.out.println("last number condition : " + reverse);
		}
			System.out.println("OUTPUT : " + reverse);
		}
}
