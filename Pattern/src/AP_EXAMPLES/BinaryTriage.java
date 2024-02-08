package AP_EXAMPLES;

public class BinaryTriage {
	public static void main(String[] args) {
		int enterInput=5;
		int print=10;
		for(int i=1;i<=enterInput; i++) {
			
			for(int j=i; j>=0;j--) {
				System.out.print(print+" ");
				print++;
			}
			System.out.println();
		}

	}

}
