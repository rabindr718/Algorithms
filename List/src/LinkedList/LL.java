package LinkedList;
public class LL {
	Node head;
	private int size;
	LL(){
		this.size=0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	//Add First Element of LinkedList

	public void AddFirst(String data) {
		Node newNode=new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	//Add Last Element of LinkedList

	public void AddLast(String data) {
		Node newNode=new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!= null) {
			currNode=currNode.next;
		}
		currNode.next=newNode; //it display last added
		
	}
	//Print Element of LinkedList

	public void printList() {
		if(head==null) {
			System.out.println("List is Empty ");
			return;
		}
		Node currNode=head;
		while(currNode!= null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		

		System.out.print(" NULL ");
		System.out.println();


	}
	//Delete First Element of LinkedList
	public void deleteFirst() {
		if(head==null) {
			System.out.println("The List is Empty ");
			return;
		}
		size--;
		head=head.next;
	}
	
	//Delete Last Element of LinkedList
	public void deleteLast() {
		if(head==null) {
			System.out.println("The List is empty ");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondLastNode=head;
		Node lastNode=head.next;
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			secondLastNode=secondLastNode.next;
		}
		secondLastNode.next=null;
	}
		
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		LL list=new LL();
		list.AddFirst("A");
		list.AddFirst("is");
		list.printList();
		
		list.AddLast("list");
		list.printList();
		
		list.AddFirst("this");
		list.printList();
		System.out.println(list.getSize());
		list.deleteLast();
		System.out.println(list.getSize());

	}

}
