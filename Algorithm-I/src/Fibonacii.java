import java.util.Scanner;
public class Fibonacii {

	public static void main(String[] args) {

		int first=0, second=1, third,i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number Till You Want");
		int TillNumber=input.nextInt();
		System.out.print(first+" "+ second);	
			for(i=0; i<TillNumber; i++) {
				third=first+second;
				first=second;
				System.out.print(first+" First ");

				second=third;
				System.out.print(second +" Second ");

				System.out.println("  "+third);		
		}
	}

}
