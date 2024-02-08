import java.util.Scanner;

public class InnerMultiplication {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The Row : ");
		int row=input.nextInt();
		System.out.println("Enter The Columns : ");
		int col=input.nextInt();
		System.out.println("Enter The Elements : ");
		
		int matrix[][]=new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j< col; j++) {
				matrix[i][j]=input.nextInt();
			}	
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j< col; j++) {
				System.out.print(matrix[i-1][j-1]+" ");	
				}	
			System.out.println();
		}
//		int updateMatrix[][]=new int[row][col];
//		for(int i=0; i<row; i++) {
//			for(int j=0; j< col; j++) {
////				if(matrix[i][j]==matrix[1][1] || matrix[i][j]==matrix[i-1][j-1]) {
//					System.out.print(updateMatrix[i-1][j-1]+" ");	
//
////		updateMatrix[i][j]*=matrix[i][j];
//			//	}
//			}
//		}
		
//		for(int i=0; i<row; i++) {
//			for(int j=0; j< col; j++) {
//				System.out.print(updateMatrix[i][j]+" ");	
//				}	
//			System.out.println();
//		}
		
	}

}
