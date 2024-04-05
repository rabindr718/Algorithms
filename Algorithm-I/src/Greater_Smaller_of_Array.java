public class Greater_Smaller_of_Array {
	    public static void main(String[] args) {
	    	int array[]= {22,1,14,33,28,21,88,99};
	    	int small=array[0];
	    	int Largest=array[0];
	    	for(int i=0; i<array.length; i++) 
	    	{
	    		if(array[i]<small) {
	    			small=array[i];
	    		} 
	    		else if(array[i]>Largest) {
	    			Largest=array[i];
	    		}
	    	}
	    	System.out.println("SMALLEST "+small);
	    	System.out.println("LARGEST "+ Largest);
	       
	    }
	}

