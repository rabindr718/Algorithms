package August;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number for Check ! ");
		int number=input.nextInt();
		if(number==0 && number%number==0) {
			System.out.println(number +"Prime");
		}
	}

}
