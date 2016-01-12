package LinkedList;
/*
 * Custom class that has implementation of linked list and its utility methods.
 *
 * */

public class LinkedList {
	Node head;
	Node tail;
	int length;

	public Node getHead(){
		return head;
	}
	
	public Node getTail(){
		return tail;
	}
	
	public int getLength(){
		return length;
	}
	
	public void addAtFirst(Node newNode){
		newNode.setNext(head);
		head = newNode;
		length = length+1;
	}
	
	public void addAtEnd(Node newNode){
		Node temp = head;
		if(head == null)
			addAtFirst(newNode);	
		else{
			while(temp != null)
				temp = temp.getNext();
			temp.setNext(newNode);
		}
	}
	
	public boolean isEmpty(){
		if(head == null)
			return true;
		else 
			return false;
	}
	
	public void insertAfterKey(int key,Node newNode){
		Node temp = head;
		boolean elemFndFlg = false;
		
		while(temp!= null){
			if(temp.getData() == key){
				elemFndFlg = true;
				break;
			}
			else
				temp = temp.getNext();
		}
		if(elemFndFlg){
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		else{
			System.out.println("Element KEY not found in the list");
		}
	}
	
	public void insertBeforeKey(int key, Node newNode){
		Node temp = head;
		Node prev = head;
		boolean elemFndFlg = false;
		
		while(temp!= null){
			if(temp.getData() == key){
				elemFndFlg = true;
				break;
			}
			else{
				prev = temp;
				temp = temp.getNext();
			}
		}
		if(elemFndFlg){
			newNode.setNext(temp);
			prev.setNext(newNode);
		}
	}
	
	public void insertAtPosition(int pos, int data){
		Node temp = head;
		Node newNode = new Node(data);
		for(int i = 0; i < pos; i++)
			temp = temp.getNext();
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}
	
	public void deleteKey(int key){
		Node temp = head;
		Node prev = head;
		boolean eleFound = false;
		
		while(temp != null){
			if(temp.getData() == key){
				eleFound = true;
				break;
			}
			else{
				prev = temp;
				temp = temp.getNext();
			}
		}
		
		if(eleFound){
			prev.setNext(temp.getNext());
		}
		else{
			System.out.println("Element with key :"+key+" is not found in the list");
		}
	}
	
	public void deletePosition(int pos){
		
	}
	
	public void deleteHead(){
		if(length!=0){
			head = head.getNext();
			length--;
		}
		else
			System.out.println("Length of List is ZERO hence we cannot delete");
	}
	
	public void deleteTail(){
		if(length>1){
			Node temp = head;
			Node prev = head;
			while(temp!=null){
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(null);
			tail = prev;
			length--;
		}
		else
			System.out.println("Length of List is ZERO hence we cannot delete");
	}
	
	public int findLength(){
		int length = 0;
		Node temp = head;
		while(temp != null){
			length++;
			temp = temp.getNext();
		}
		return length;
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.println("The elements in the list are:");
			System.out.println(temp.getData()+" ");
		}
	}
	
	public void clearList(){
		head = null;
		tail = null;
		length = 0;
	}
	
	public void findMidElement(){
		Node fastPtr = head;
		Node slowPtr = head;
		while(fastPtr != null){
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
		}
		System.out.println("The Mid element in this list is:"+slowPtr.getData());
	}
	
	public void reverseList(){
		
	}
	
	public void isPalindrome(){
		
	}
}
