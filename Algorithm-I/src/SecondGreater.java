public class SecondGreater {
	public static void main(String[] args) {
		int array[]= {22,1,14,33,28,21,88,99};
		int secondGreatest=array[0];
		int Largest=array[0];
		
		for(int i=0; i<array.length;i++) {
			if(array[i]>Largest) {
				secondGreatest=Largest;
				Largest=array[i];
			}
			else if(array[i]>secondGreatest && array[i] !=Largest) {
				secondGreatest=array[i];
				
			}
		}
		System.out.println(secondGreatest+" ");
	}

}
