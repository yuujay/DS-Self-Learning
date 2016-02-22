package LinkedList;

public class Node <T> {
	T data;
	Node nextNode;
	
	
	public Node(T val){
		this.data = val;
		this.nextNode = null;
	}
	
	/*
	 * Node(T val, Node nxtNode){
		this.data = val;
		setNext(nxtNode);
	}
	*/
	
	public T getData(){
		return this.data;
	}
	
	public void setData(T val){
		this.data = val;
	}
	
	public Node getNext(){
		return this.nextNode;
	}
	
	public void setNext(Node nxtNode){
		this.nextNode = nxtNode;
	}
}
