package basic;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner iytScanner=new Scanner(System.in);
		String string=iytScanner.nextLine();
		String duplicateString=string;
		String revString="";
		char ch[]=string.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			revString=revString+ch[i];
			
		}
		if(string.equals(revString)) {
			System.out.println("Palindrome String ");
		}else {
			System.out.println("NOT Palindrome String ");

		}
	}

}
