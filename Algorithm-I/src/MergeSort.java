
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Size of Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		mergeSort(arr,0,arr.length-1);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		

	}
	private static void mergeSort(int arr[], int i, int j) {
		
		if(i>j) {
			int mid=(i+j)/2;
			mergeSort(arr, i,mid);
			mergeSort(arr, mid+1, j);
			mergeSort(arr,i, mid, j);
		}
		
	}
	private static void mergeSort(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int i=low;
		int j=mid+1;
		int k=low;
		
		int [] b=new int[arr.length];
		while(i<mid&&j<=high) {
			if(arr[i]<arr[j]) {
				b[k]=arr[i];
				i++;
				k++;
				
			}else {
				b[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			
			b[k]=arr[i];
			i++;
			k++;
			
		}while(j>=high) {
			b[k]=arr[j];
			j++;
			k++;
			
		}
		for(i=low; i<=high;i++) {
			arr[i]=b[i];
		}
		
	}

}
