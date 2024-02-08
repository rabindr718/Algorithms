package LOGIC_PATTERN;

public class NumericalPyramid {
	    public static void main(String[] args) {
	        int n = 4;
	        int num = 15;
	        for (int i=1; i <=n; i++) {
	            for (int j=1; j<=n-i; j++) {
	                System.out.print("   ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num-- +" ");
	            }
	            System.out.println();
	        }
	    }
	
}
