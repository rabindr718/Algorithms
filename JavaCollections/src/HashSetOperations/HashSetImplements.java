package HashSetOperations;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetImplements {
	public static void main(String[] args) {		
		HashSet<String> hasset=new HashSet<>();
		hasset.add("Sharma");
		hasset.add("Rabindra ");
		hasset.add("Kumar ");
		hasset.add("Shilpi");
		hasset.add("jodidar");

		System.out.println("Original Array : "+hasset);
		System.out.println(" ");

		hasset.remove("jodidar");
        hasset.removeIf(str->str.contains("Shilpi"));    //Specific Condition Elements Remove

//		  Iterator<String> i=hasset.iterator();  
//          while(i.hasNext())  
//          {  
//          System.out.println(i.next());  
//          } 

		for(String str:hasset) {

			System.out.println(str);
		}
//		hasset.removeAll(hasset);
		hasset.addAll(hasset);

		
		System.out.println("Update Elements : "+hasset);

	}

}
