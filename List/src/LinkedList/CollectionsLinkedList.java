package LinkedList;
import java.util.*;
public class CollectionsLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.addFirst("this");
		list.addFirst("is");
		System.out.println(list);
		list.add("list");				//By default add added element at Last.
		System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+" -> ");
		}
		System.out.print("null");
//		list.remove("Passes the INDEX inside");

	}

}
