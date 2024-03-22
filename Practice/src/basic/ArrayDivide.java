package basic;
public class ArrayDivide {
	public static void main(String[] args) {
		int array[]= {6, 2,6,7,8,10,33,55,88,66,55,44,22,14};
		int evenArray[]= {};
		int OddArray[]= {};
		for(int i=0; i<array.length; i++) {		
			System.out.print(array[i]+" ");
			if(array[i]%2==0) {
				evenArray[i]=array[i];
			}
			System.out.print(evenArray[i]);

			if(array[i]%2 !=0) {
				OddArray[i]=array[i];
			}
			System.out.print(OddArray[i]);
			
		}


	}

}
