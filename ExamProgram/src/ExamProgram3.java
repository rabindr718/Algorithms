import java.util.Arrays;
public class ExamProgram3 {
	public static void main(String[] args) {
	        int[] sides = {4, 4, 4, 4}; 
	        
	        Arrays.sort(sides);
	        
	        if (sides[0] == sides[3]) {
	            System.out.println("It is a square.");
	        } else if (sides[0] == sides[2] && sides[1] == sides[3]) {
	            System.out.println("It is a parallelogram.");
	        } else if (sides[0] == sides[1] && sides[2] == sides[3]) {
	            System.out.println("It is a rectangle.");
	        } else {
	            System.out.println("It is a quadrilateral.");
	        }
	    }
	}


