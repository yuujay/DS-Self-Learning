package LinkedList;
/*
 * Custom class that has implementation of linked list and its utility methods.
 *
 * */

public class LinkedList<T> {
	private Node <T> head;
	private Node <T> tail;
	private int length;

	public Node <T> getHead(){
		return head;
	}
	
	public Node <T> getTail(){
		return tail;
	}
	
	public int getLength(){
		return length;
	}
	
	LinkedList(){
		length = 0;
		head = null;
		tail = null;
	}
	public void addAtFirst(Node <T> newNode){
		newNode.setNext(head);
		head = newNode;
		length = length+1;
	}
	
	public void addAtEnd(Node <T> newNode){
		Node <T> temp = head;
		if(head == null)
			addAtFirst(newNode);	
		else{
			while(temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(newNode);
		}
		length = length+1;
	}
	
	public boolean isEmpty(){
		if(head == null)
			return true;
		else 
			return false;
	}
	
	public void insertAfterKey(T key,Node <T> newNode){
		Node <T> temp = head;
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
	
	public void insertBeforeKey(T key, Node <T> newNode){
		Node <T> temp = head;
		Node <T> prev = head;
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
	
	public void insertAfterPosition(int pos, T data){
		Node <T> temp = head;
		Node <T> newNode = new Node <T> (data);
		if(pos <= length){
			for(int i = 1; i < pos; i++)
				temp = temp.getNext();
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			length++;
		}
		else
			System.out.println("Position is larger than the length");
	}
	
	public void deleteKey(T key){
		Node <T> temp = head;
		Node <T> prev = head;
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
			length--;
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
			Node <T> temp = head;
			Node <T> prev = head;
			while(temp.getNext()!=null){
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(null);
			tail = prev;
			length--;
		}
		else if(length == 1){
			head = null;
			tail = null;
			length--;
		}
		else
			System.out.println("Length of List is ZERO hence we cannot delete");
	}
		
	public void printList(){
		Node <T> temp = head;
		System.out.println("The elements in the list are:");
		System.out.println("");
		if(length >= 1)
			while(temp != null){
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
		else 
			System.out.println("The list is empty");
	}
	    
	public void clearList(){
		head = null;
		tail = null;
		length = 0;
	}
	
	public void findMidElement(){
		Node <T> fastPtr = head;
		Node <T> slowPtr = head;
		while(fastPtr.getNext() != null && fastPtr.getNext().getNext() != null){
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
