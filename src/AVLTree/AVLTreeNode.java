package AVLTree;

public class AVLTreeNode <T>{
	
	private T data;
	private int height;
	private AVLTreeNode<T> left;
	private AVLTreeNode<T> right;
	
	AVLTreeNode(){
		data = null;
		height = 0;
		left = null;
		right = null;
	}
	
	AVLTreeNode(T data){
		this.data = data;
		height = 0;
		left = null;
		right = null;
	}

	public T getData() {
		return data;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public AVLTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(AVLTreeNode<T> left) {
		this.left = left;
	}

	public AVLTreeNode<T> getRight() {
		return right;
	}

	public void setRight(AVLTreeNode<T> right) {
		this.right = right;
	}
	
	
}
