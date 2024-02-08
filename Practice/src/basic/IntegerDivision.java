package basic;

public class IntegerDivision {
	
	public double mymethod(int x, int y) {
		return x+y;
	}
	public void mymethod(int x, double y) {
		double z=x+y;
		System.out.print(z);
	}
	public long mymethod(long x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
	
		IntegerDivision integerDivision=new IntegerDivision();
		 integerDivision.mymethod(9, 98.9);
		 double g=integerDivision.mymethod(6, 76);
		 System.out.println();
		 System.out.println(g);
		 

//		System.out.println(integerDivision.mymethod(8, 99.8));
				
	} 

}
