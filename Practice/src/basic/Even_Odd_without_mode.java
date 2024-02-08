package basic;
import java.util.Scanner;

public class Even_Odd_without_mode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		
		if((number & 1)==0) {
			
			System.out.println("Even ");
		}
		else {
			System.out.println("Odd ");
		}
	}

}
