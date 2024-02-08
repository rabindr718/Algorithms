import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter Here Your Name");
        String name = scanner.next(); 
        
        
        for (char c : name.toCharArray()) {
            System.out.println(c + "     " + c); 
        }
    }
}
