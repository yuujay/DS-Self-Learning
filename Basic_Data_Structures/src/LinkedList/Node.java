package LinkedList;

public class Node {
	int data;
	Node nextNode;
	
	
	Node(int val){
		this.data = val;
		this.nextNode = null;
	}
	
	Node(int val, Node nxtNode){
		this.data = val;
		setNext(nxtNode);
	}
	
	int getData(){
		return this.data;
	}
	
	void setData(int val){
		this.data = val;
	}
	
	Node getNext(){
		return this.nextNode;
	}
	
	void setNext(Node nxtNode){
		this.nextNode = nxtNode;
	}
}
