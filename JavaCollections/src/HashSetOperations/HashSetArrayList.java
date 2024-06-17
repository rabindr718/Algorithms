package HashSetOperations;
import java.util.ArrayList;
import java.util.HashSet;
public class HashSetArrayList {
	public static void main(String[] args) {
		ArrayList <String> list =new ArrayList<>();
		
		list.add("Rabindra ");
		list.add("Kumar ");
		list.add("Sharma");
		list.add("Siwan");
		list.add("Bihar");
//		list.remove("Siwan");
		
		HashSet<String> set=new HashSet(list);
		
		set.add("India, 841226");
		set.add("Siwan");
		System.out.println("Elemenets of List : "+list);
		System.out.println("Elemenets of Set : "+set);


	}

}
