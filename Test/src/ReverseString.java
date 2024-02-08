import java.util.Scanner;

public class ReverseString {
	public static  String ReverseString(String str) {
		char revers[]=str.toCharArray();
		String revString="";
		for(int i=revers.length-1; i>0; i--) {
			revString=revString+revers[i];			
		}
		return revString;	
	}
	public static void main(String[] args) {
		Scanner inputScanner =new Scanner(System.in);

		System.out.println(ReverseString(inputScanner.nextLine()));
	}

}
