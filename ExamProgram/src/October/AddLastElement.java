package October;

public class AddLastElement {
	
    public static void main(String[] args) {
        int[] array = {123, 531, 678, 876, 467, 124};
        int sum = 0;
        
        for (int num : array) {
            sum += num % 100;
        }
        
        System.out.println("Result: " + sum);
    }
}

	
	

