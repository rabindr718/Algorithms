public class Greater_Smaller {

	public static void main(String[] args) {
		
		int arr[]= {3,5,7,8,9,6};
		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
			if(arr[i]>small) {
				small=arr[i];
			}if(arr[i]<large) {
				large=arr[i];
			}
			
			
			
		}
		System.out.print(small+ " "+large);


	}
}
