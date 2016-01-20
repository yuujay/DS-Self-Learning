package Queue;
import LinkedList.Node;

public class Queue<T> implements IQueueInterface<T>{
	Node<T> entry;
	Node<T> exit;
	int length;
	
	Queue(){
		entry = null;
		exit = null;
		length = 0;
	}
	
	public int getLength(){
		return length;
	}
	
	public boolean isQueueEmpty(){
		return (length == 0);
	}
	
	@Override
	public void enqueue(T item) {
		// TODO Auto-generated method stub
		Node<T> temp = new Node<T>(item);
		
		if(isQueueEmpty()){
			entry = temp;
			exit = temp;
		}
		else{
			exit.setNext(temp);
			temp.setNext(null);
			exit = temp;
		}
		length++;
	}
	
	@Override
	public T dequeue() throws Exception {
		// TODO Auto-generated method stub
		if(!isQueueEmpty()){
			T dequeueEle = entry.getData();
			entry = entry.getNext();
			length--;
			return dequeueEle;
		}
		else{
			throw new Exception("Queue is Empty");
		}
	}
	
	@Override
	public T seek() throws Exception{
		// TODO Auto-generated method stub
		if(!isQueueEmpty()){
			return entry.getData();
		}
		else
			throw new Exception("Queue is Empty");
	}

	@Override
	public void printQueue() {
		// TODO Auto-generated method stub
		
		Node<T> temp = entry;
		System.out.println("The elements in the queue are :");
		while(temp != null){
			System.out.print(temp.getData()+"->");
			temp = temp.getNext();
		}
	}
	
	
}
