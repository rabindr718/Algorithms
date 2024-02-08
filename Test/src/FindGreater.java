
public class FindGreater {

	public static void main(String[] args) {
		int []arr= {4,6,7,5,4,3,2,1,10};
		int small=arr[0];
		int greater=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
			if(greater<arr[i]) {
				greater=arr[i];
			}	
		}
		System.out.println(small +" ");
		System.out.print(greater+" ");

	}

}