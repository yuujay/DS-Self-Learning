package LinkedList;

public class Node <T> {
	T data;
	Node nextNode;
	
	
	Node(T val){
		this.data = val;
		this.nextNode = null;
	}
	
	Node(T val, Node nxtNode){
		this.data = val;
		setNext(nxtNode);
	}
	
	T getData(){
		return this.data;
	}
	
	void setData(T val){
		this.data = val;
	}
	
	Node getNext(){
		return this.nextNode;
	}
	
	void setNext(Node nxtNode){
		this.nextNode = nxtNode;
	}
}
