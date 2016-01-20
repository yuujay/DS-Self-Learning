package LinkedList;

public class LinkedListImpl {
	
	public static void main(String args[]){
		Node<Integer> a = new Node<Integer>(1);
		Node<Integer> b = new Node<Integer>(5);
		Node<Integer> c = new Node<Integer>(10);
		Node<Integer> d = new Node<Integer>(11);
		Node<Integer> e = new Node<Integer>(12);
		Node<Integer> f = new Node<Integer>(16);
		Node<Integer> g = new Node<Integer>(17);
		Node<Integer> h = new Node<Integer>(21);
		LinkedList<Integer>  list = new LinkedList<Integer>();
		
		list.addAtFirst(a);
		list.addAtFirst(b);
		list.addAtEnd(c);
		list.addAtFirst(d);
		list.addAtFirst(e);
		list.addAtFirst(f);
		list.addAtFirst(g);
		list.insertAfterPosition(6, 77);
		list.insertAfterPosition(6, 90);
		//list.deletePosition(1);
		list.deleteKey(77);
		//System.out.println(list.getTail().getData());
		//list.deleteHead();
		//list.deleteTail();
		//list.deleteTail();
		//list.deleteTail();
		list.printList();
		//System.out.println("Length of the list is: "+ list.getLength());
		//list.findMidElement();
	}
}
