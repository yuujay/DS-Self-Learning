package BinaryTree;

public class Node <T>{
	private T data;
	private Node<T> left;
	private Node<T> right;

	Node(T data){
		this.data = data;
		left = null;
		right = null;
	}
	
	Node(T data, Node<T> leftNode, Node<T> rightNode){
		this.data = data;
		this.left = leftNode;
		this.right = rightNode;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}
}
