package October;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner inputScanner=new Scanner(System.in);
		String inputvalueString=inputScanner.nextLine();
		
		String reverseStored="";
		for(int i=inputvalueString.length()-1; i>=0; i--) {
			reverseStored=reverseStored+inputvalueString.charAt(i);
		}
		System.out.print(reverseStored);
		
	}

}
