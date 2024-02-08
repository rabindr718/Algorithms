package basic;
public class NumberPalindrome {
	public static void main(String[] args) {

int palindrome=1212129;
int number=palindrome;
int rev=0;
while(palindrome!=0) {
	rev=rev*10+palindrome%10;
	palindrome=palindrome/10;
}
System.out.println(rev+"Palindrome");

if(number==rev) {
	System.out.println("Palindrome");
}else {
	System.out.println("NOT Palindrome");

}
	}

}
