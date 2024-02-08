import java.util.Scanner;
public class PrintInsideElements {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		int row=inputScanner.nextInt();
		int col=inputScanner.nextInt();
		int matrix[][]=new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j]=inputScanner.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				sum		   = matrix[1][1] + matrix[1][2] + matrix[1][3] 
						   + matrix[2][1] + matrix[2][2] + matrix[2][3]
						   + matrix[3][1] + matrix[3][2] + matrix[3][3];			
			}
		}
		System.out.print(sum +" ");
	}
}
