package BinaryTree;

public class BSTImpl {

	public static void main(String args[]){
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(bst, 10);
		bst.insert(bst, 20);
		bst.insert(bst, 30);
		bst.insert(bst, 40);
		
		System.out.println(bst.isBST(bst));
	}
}
