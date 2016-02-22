package Queue;

public interface IQueueInterface<T> {
	public void enqueue(T item);
	public T dequeue() throws Exception;
	public T seek() throws Exception;
	public void printQueue();
}
