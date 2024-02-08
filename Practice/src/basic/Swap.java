package basic;

public class Swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Using With Wise    "+  a + b);

		a=a^b;
		System.out.println(a+ " A");

		b=a^b;
		System.out.println(b+ " B");

		a=a^b;
		System.out.println(a+ " A");

		System.out.println(a+ " "+b);

		
		
	}

}
