package Stack;

import LinkedList.Node;

public class Stack <T> implements IStackOperations<T>{

	private Node<T> top;
	private static int length;
	
	Stack(){
		top = null;
		this.length = 0;
	}
	
	public int getLength(){
		return this.length;
	}
	
	public Node<T> getTop(){
		return top;
	}
	
	public boolean isStackEmpty(){
		return(this.length==0);
	}
	
	public void clearStack(){
		this.length = 0;
		top = null;
	}
	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		Node <T> temp = new Node<T>(item);
		
		if(isStackEmpty()){
			top = temp;
			length = length + 1;
		}
		else{
			temp.setNext(top);
			top = temp;
			length = length + 1;
		}
	}

	@Override
	public T pop() throws Exception{
		T popData;
		// TODO Auto-generated method stub
		if(isStackEmpty()){
			throw new Exception("Cannot POP! Stack is Empty");
		}
		else{
			popData = top.getData();
			top=top.getNext();
			length = length - 1;
			return popData;
		}
	}

	@Override
	public T peek() throws Exception {
		// TODO Auto-generated method stub
		if(isStackEmpty()){
			throw new Exception("Cannot PEEK! Stack is Empty");
		}
		else{
			return top.getData();
		}
	}

	@Override
	public void printStack() {
		// TODO Auto-generated method stub
		Node<T> temp = top;
		System.out.println("Elements in stack from top are:");
		
		while(temp != null){
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

}
 