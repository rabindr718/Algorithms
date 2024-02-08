import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Row and Columns");
		int row =inp.nextInt();
		int col=inp.nextInt();
		
		int matrix[][]=new int [row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j]=inp.nextInt();
			}
		}
		System.out.print(" enter Position ");

		int findNumber=inp.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				if(matrix[i][j]==findNumber) {
					System.out.print("This is Position "+ i+"  , "+ j);
				}
			}
		}
		
		
	}
}

//if(matrix[1][1] && matrix[1][2] && matrix[1][3] &&
//		   matrix[2][1] && matrix[2][2] && matrix[2][3] &&
//		   matrix[3][1] && matrix[3][2] && matrix[3][3]==matrix[i][j] ) {
//			int sum=
//			
//		}
