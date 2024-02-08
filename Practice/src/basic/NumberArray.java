package basic;
import java.util.Scanner;
public class NumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int array[]=new int[number];
		for(int i=0; i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=array.length-1; i>=0; i--) {
			System.out.println("Result : "+ array[i]+" ");
			
		}

	}

}
