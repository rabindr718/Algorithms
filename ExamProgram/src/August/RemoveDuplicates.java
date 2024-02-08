package August;

import java.util.Arrays;
import java.util.LinkedHashSet;
public class RemoveDuplicates {
	public static void main(String[] args) {
		int number[]= {1,1,2,2,2};
		int[] uniqueArray=removeDuplicates(number);
		System.out.println("Arrays with duplicates removed "+Arrays.toString(uniqueArray));
		
	}
	public static int[]removeDuplicates(int[] arr){
		return Arrays.stream(arr).distinct().toArray();
	}
	
}
