import java.util.Scanner;
public class ArrayProgram {
	
	public static void main(String[] args) {
		
		Scanner inputScanner=new Scanner(System.in);
		int size=inputScanner.nextInt();
		int arr[]=new int[size];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=inputScanner.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}