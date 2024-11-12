package CollectionArraySolutions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException  {
		int array[]= {33,2,1,3,4,4,5,5,6,7,8};
		Set<Integer> uniqueNumberSet=new HashSet<>();
		boolean isDuplicate=false;
		
		for(int i=0; i<=array.length; i++) {
			if(uniqueNumberSet.contains(array[i])) {
				isDuplicate=true;
				System.out.println("Duplicates "+array[i]);
			}else {
				uniqueNumberSet.add(array[i]);
			}

		}
		if(isDuplicate) {
			System.out.println(-1);
		}

	}

}
