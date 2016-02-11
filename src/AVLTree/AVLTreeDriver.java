package AVLTree;

public class AVLTreeDriver {
	 public static void main(String[] args){

        AVLTree<Integer> tree = new AVLTree<Integer>();
        tree.insertNode(10);
        tree.insertNode(5);
        tree.insertNode(3);
        tree.insertNode(1);
        tree.insertNode(12);
        System.out.println(tree.balance(tree.getRoot()));
        tree.printTreeUsingInOrder(tree.getRoot());
    }
}
