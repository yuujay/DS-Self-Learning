package BinaryTree;

public interface IBTreeInterface<T> {
	Node<T> lookUp(Node b, T value);
	void insert(BinarySearchTree b, T value);
	Node<T> delete(Node b, T value);
	int size(Node b);
	int maxDepth(BinarySearchTree b);
	T minValue(Node b);
	void printPostOrder(Node curNode);
	void printPreOrder(Node curNode);
	void printInOrder(Node curNode);
	boolean hasPathSum(BinarySearchTree b, int sumValue);
	Node mirror(BinarySearchTree b);
	boolean isBST(BinarySearchTree b);
	
}
