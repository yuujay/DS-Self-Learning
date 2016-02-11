package AVLTree;

public class AVLTree<T extends Comparable <T>> {
	
	private AVLTreeNode<T> root;
	private T data;	
	
	AVLTree(){
		root = null;
		data = null;
	}
	
	AVLTreeNode<T> getRoot(){
		return root;
	}
	
	AVLTreeNode<T> setRoot(AVLTreeNode<T> node){
		return root = node;
	}
	
	boolean isEmpty(){
		return (root == null);
	}
	
	/*
	 * Returns the height of that node that is being passed.
	 */
	int height(AVLTreeNode<T> node){
		if(node == null){
			return -1;
		}
		else{
			return( Integer.max( height(node.getLeft()), height(node.getRight()) ) +1 );
		}
	}	
	
	AVLTreeNode<T> getMin(AVLTreeNode<T> b){
		if(b == null){
			return null;
		}
		else if(b.getLeft() == null)
			return b;
		
		return(getMin(b.getLeft()));
	}
	
	AVLTreeNode<T> rotateLeft(AVLTreeNode<T> node){
		AVLTreeNode<T> temp = node.getRight();
		node.setRight(temp.getLeft());
		temp.setLeft(node);
		return temp;
	}
	
	AVLTreeNode<T> rotateRight(AVLTreeNode<T> node){
		AVLTreeNode<T> temp = node.getLeft();
		node.setLeft(temp.getRight());
		temp.setRight(node);
		return temp;
	}
	
	void insertNode(T data){
		if(getRoot() == null){
			 setRoot(new AVLTreeNode<T>(data));
		}
		else{
			AVLTreeNode<T> newNodeParent = addToSubTree(getRoot(),data);
			//return balanceNodes(newNodeParent, data);
		}
	}
	
	AVLTreeNode<T> addToSubTree(AVLTreeNode<T> node, T data ){
		//Compare Data with current node key value, if it is less then go right and check.
		if(data.compareTo(node.getData()) <= 0){			
			if(node.getLeft() == null){
				node.setLeft((new AVLTreeNode<T>(data)));
				balanceNodes(node, data);
				return node;
			}
			else 
				return addToSubTree(node.getLeft(),data);
		}
		else{
			if(node.getRight() == null){
				node.setRight((new AVLTreeNode<T>(data)));
				balanceNodes(node, data);
				return node;
			}
			else 
				return addToSubTree(node.getRight(),data);
		}
	}
	
	AVLTreeNode<T> balanceNodes(AVLTreeNode<T> parNode, T data){
		int balance = balance(parNode);
		if(balance > 1){ //Left tree is heavy
			//Check for LL or LR
			if(data.compareTo(parNode.getLeft().getData()) > 0){
				parNode.setLeft( rotateLeft (parNode.getLeft() ) );
				return rotateRight(parNode);
			}
			else if(data.compareTo(parNode.getLeft().getData()) > 0){
				return rotateRight(parNode);
			}
		}
		else if(balance < -1){
			if(data.compareTo(parNode.getRight().getData()) > 0){
				return rotateLeft(parNode);
			}
			else if (data.compareTo(parNode.getRight().getData()) < 0){
				parNode.setRight( rotateRight(parNode.getRight() ) );
				return rotateLeft(parNode);
			}
		}
		return parNode;
	}
	
	/*
	 * Returns the balance of the node that is being passed.
	 */
	int balance(AVLTreeNode<T> b){
		return(height(b.getLeft()) - height(b.getRight()));
	}
	
	
	public void printTreeUsingInOrder(AVLTreeNode<T> root) {
        if (root == null) {
            return;
        }
        printTreeUsingInOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        printTreeUsingInOrder(root.getRight());
    }
}
