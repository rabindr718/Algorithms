package basic;
public class StringPalindrome {
	public static void main(String[] args) {

		String palidrome="XER";
		String string2=palidrome;
		String revString="";
		char a[]=palidrome.toCharArray();
		for(int i=a.length-1; i>=0; i--) {
			revString=revString+a[i];
		}
		if(revString.equals(palidrome)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("NOT Palindrome");

		}
	}

}
