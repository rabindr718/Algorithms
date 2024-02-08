
public class Find_Greater {

	public static void main(String[] args) {

		int arr[]= {2,5,6,8,5,1,3,9};
		int min=arr[0];
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			} if(arr[i]>max) {
				max=arr[i];	
			}
		}
			System.out.println(max);
	}

}
