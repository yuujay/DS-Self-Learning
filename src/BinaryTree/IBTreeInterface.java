package BinaryTree;

public interface IBTreeInterface<T> {
	boolean lookUp(BinarySearchTree b, T value);
	Node insert(BinarySearchTree b, T value);
	Node delete(BinarySearchTree b, T value);
	int size(BinarySearchTree b);
	int maxDepth(BinarySearchTree b);
	T minValue(BinarySearchTree b);
	void printPostOrder(BinarySearchTree b);
	boolean hasPathSum(BinarySearchTree b, int sumValue);
	Node mirror(BinarySearchTree b);
	boolean isBST(BinarySearchTree b);
}
