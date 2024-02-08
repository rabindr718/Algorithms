package TWO_D_Array;
import java.util.Scanner;
public class AddTwo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows ");
		int rows=scanner.nextInt();	
		System.out.println("Enter Columns ");
		int columns=scanner.nextInt();
		int number[][]=new int [rows][columns];
		System.out.println("Enter the Elements of Array ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				number[i][j]=scanner.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
//			System.out.print(number[i][j]+" ");
				if(number[i][j]%2==0) {
					sum=sum+number[i][j];
				}
			}
			System.out.println(sum+"");

			System.out.println("");			

		}
		
	}
}
