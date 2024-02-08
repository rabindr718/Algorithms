import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=0; i<number; i++) {
			for(int j=i-number; i>1 ; i--) {
				System.out.println(" ");
			}
			for(int j=0; j<number; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
