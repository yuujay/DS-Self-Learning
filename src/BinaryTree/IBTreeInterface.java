package BinaryTree;

public interface IBTreeInterface<T> {
	Node<T> lookUp(Node b, T value);
	Node<T> insert(BinarySearchTree b, T value);
	Node<T> delete(BinarySearchTree b, T value);
	int size(BinarySearchTree b);
	int maxDepth(BinarySearchTree b);
	T minValue(BinarySearchTree b);
	void printPostOrder(BinarySearchTree b);
	boolean hasPathSum(BinarySearchTree b, int sumValue);
	Node mirror(BinarySearchTree b);
	boolean isBST(BinarySearchTree b);
}
