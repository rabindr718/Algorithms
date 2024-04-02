package SwitchLoops;
import java.util.Scanner;
import javax.print.DocFlavor.INPUT_STREAM;
public class LiftProgram {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Floor Number Here 👇🏻 ");
		while (true) { // Loop indefinitely
            String floorNumber = input.next();
            if (floorNumber.equalsIgnoreCase("close")) 
            {
            	break;
            }
            switch(floorNumber) {
			case "1": System.out.println("You are at : "+floorNumber +"th Floor");
			break;
			case "2": System.out.println("You are at : "+floorNumber+ "th Floor");
			break;
			case "3": System.out.println("You are at : "+floorNumber+"th Floor");
			break; 
			case "4": System.out.println("You are at : "+floorNumber+"th Floor");
			break;
			case "5": System.out.println("You are at : "+floorNumber+"th Floor");
			break;
			case "6": System.out.println("You are at : "+floorNumber+"th Floor");
			break;
			case "7": System.out.println("You are at : "+floorNumber+"th Floor");
			break;
			case "8": System.out.println("You are at : "+floorNumber+"th Floor");
			break;
			case "9": System.out.println("You are at : "+floorNumber+"th Floor");
			break;
        	}
        }
	input.close();
	}
}
