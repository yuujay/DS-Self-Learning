package BinaryTree;

public class Node <T>{
	private T data;
	private Node left;
	private Node right;

	Node(T data){
		this.data = data;
		left = null;
		right = null;
	}
	
	Node(T data, Node leftNode, Node rightNode){
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

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
