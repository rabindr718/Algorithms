import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str, reverse="";
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String : ");
		str=input.nextLine();
		int length=str.length();
		for(int i=length-1; i>=0; i--) 
			reverse=reverse+str.charAt(i);
			if(reverse.equals(str)) {
				System.out.println("This is Palindrome String ");
			}else {
				System.out.println("This is not Palindorme String");
			}
			
		
	}

}
