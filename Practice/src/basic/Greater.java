package basic;
import java.util.Scanner;
public class Greater {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int array[]=new int[size];
		for(int i=0; i<size; i++) {
			array[i]=scanner.nextInt();		
		}
		for(int i=0; i<array.length; i++) {
			int min=0;
			int max=0;
			if(array[i]>0) 
			{
				System.out.println(array[i]+" is Greater");
	
			}else if(array[i]<0) {
				System.out.println(array[i]+"This is Min");
			}
		}
	}

}
