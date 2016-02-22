package BinaryTree;

public interface IBTreeInterface<T> {
	Node<T> lookUp(BinarySearchTree<?> b, T value);
	void insert(BinarySearchTree<?> b, T value);
	Node<T> delete(Node<T> b, T value);
	int size(Node<T> b);
	int maxDepth(BinarySearchTree b);
	Node<T> minValue(Node<T> b);
	void printPostOrder(Node<T> curNode);
	void printPreOrder(Node<T> curNode);
	void printInOrder(Node<T> curNode);
	boolean hasPathSum(BinarySearchTree b, int sumValue);
	Node<T> mirror(BinarySearchTree b);
	boolean isBST(BinarySearchTree b);
	
}
