package Stack;

public class StackImpl {
	
	public static void main(String args[]) throws Exception{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(10);
		stack.printStack();
		//int x = stack.getLength();
		//System.out.println(stack.peek());//
		stack.pop();
		stack.pop();
		stack.printStack();
		System.out.println(stack.peek());
	}
}
