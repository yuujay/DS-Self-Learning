package Queue;

public class QueueImpl {

	public static void main(String args[]) throws Exception{
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(15);
		q.enqueue(16);
		q.enqueue(17);
		int x = q.dequeue();
		x = q.dequeue();
		x = q.dequeue();
		x = q.dequeue();
		x = q.dequeue();
		x = q.dequeue();
		q.seek();
		System.out.println(q.seek());
		q.printQueue();
	}
}
