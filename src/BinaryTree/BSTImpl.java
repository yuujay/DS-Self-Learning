package BinaryTree;

public class BSTImpl {

	public static void main(String args[]){
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(bst, 10);
		bst.insert(bst, 20);
		bst.insert(bst, 30);
		bst.insert(bst, 40);
		bst.insert(bst, 7);
		System.out.println("LOOKUP");
		System.out.println(bst.lookUp(bst, 100));
		System.out.println(bst.minValue(bst.getRoot()));
	}
}
