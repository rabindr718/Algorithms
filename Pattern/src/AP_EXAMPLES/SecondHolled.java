package AP_EXAMPLES;

public class SecondHolled {

	public static void main(String[] args) {

		int row=9;
		int col=9;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i==1 ||  i==row  ||j==1 || j==col) {
					System.out.print("*");					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();

			
		}
	}

}
