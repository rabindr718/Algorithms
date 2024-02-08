package basic;
import java.util.Scanner;
public class Fib {

	public static void main(String[] args) {
		Scanner rScanner=new Scanner(System.in);
		int a=0, b=1, c, term=rScanner.nextInt();
		for(int i=0; i<=term; i++ ) {
			System.out.print(a+" ");
			c=a+b;		
			b=a;
			a=c;		
		}
	}

}
