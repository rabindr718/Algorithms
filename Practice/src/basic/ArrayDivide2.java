package basic;
public class ArrayDivide2 {
    public static void main(String[] args) {
	        int array[] = {6, 2, 6, 7, 8, 10, 33, 55, 88, 66, 55, 44, 22, 14};
	        int evenCount = 0;
	        int oddCount = 0;
	        // Count the number of even and odd elements
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }       // Create arrays with appropriate sizes
	        int evenArray[] = new int[evenCount];
	        int oddArray[] = new int[oddCount];
	        // Populate evenArray and oddArray
	        int evenIndex = 0;
	        int oddIndex = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] % 2 == 0) {
	                evenArray[evenIndex++] = array[i];
	            } else {
	                oddArray[oddIndex++] = array[i];
	            }        }
        // Print evenArray
	        System.out.print("Even numbers: ");
	        for (int i = 0; i < evenArray.length; i++) {
	            System.out.print(evenArray[i] + " ");
	        }        // Print oddArray
	        System.out.println();
	        System.out.print("Odd numbers: ");
	        for (int i = 0; i < oddArray.length; i++) {
	            System.out.print(oddArray[i] + " ");
	        }
	    }
	
}
