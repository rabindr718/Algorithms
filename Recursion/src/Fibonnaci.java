
public class Fibonnaci {
	public static void printFibo(int first, int second, int tillNumber) {
		if(tillNumber==0) {
			return;
		}
		System.out.print(first+" ");
		printFibo(second, first+second, tillNumber-1);
		
	}

	public static void main(String[] args) {

		printFibo(0,1,10);
	}

}
