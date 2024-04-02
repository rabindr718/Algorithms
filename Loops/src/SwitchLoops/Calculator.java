package SwitchLoops;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter First Value ");
		int First=input.nextInt();
		System.out.println("Enter the Operation : ");
		String calculateValue = input.next(); 
		System.out.print("Enter Second Value ");
		int Second=input.nextInt();
		switch(calculateValue) {
		case "Add": System.out.println("Added "+(First+Second));
		break;
		case "Subtract": System.out.println("Subtracted "+(First - Second));
		break;
		case "Multiply": System.out.println("Multiplied "+(First*Second));
		break;
		case "Divide": System.out.println("Diveded "+(First/Second));
		break;
		}	
		input.close();

	}
}
