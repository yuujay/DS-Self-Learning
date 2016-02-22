package Stack;
import LinkedList.Node;

public interface IStackOperations<T> {
	public void push(T item);
	public T pop() throws Exception;
	public T peek() throws Exception;
	public void printStack();
}
