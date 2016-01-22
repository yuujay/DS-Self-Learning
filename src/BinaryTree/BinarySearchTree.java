package BinaryTree;
/** 
 * 
 * @author UJ
 *
 * @param <T>
 */
public class BinarySearchTree <T> implements IBTreeInterface{
	private Node <T> root;
	private int height;
	
	BinarySearchTree(){
		root = null;
		height = 0;
	}
	
	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	boolean isTreeEmpty(){
		return(size(this) == 0);
	}
	
	@Override
	public Node insert(BinarySearchTree b, Object value) {
		// TODO Auto-generated method stub
		if(isTreeEmpty()){
			setRoot(new Node(value));
			return getRoot();
		}
		else{
			insertNodeToTree(getRoot(),value);
		}
		return null;
	}
	
	public Node insertNodeToTree(Node treeNode, Object value){
		//if(value <= treeNode.getData()){
		//Need to find out how to use compartor comparable interfaces
		return getRoot();	
	}
	
	@Override
	public boolean lookUp(BinarySearchTree b, Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node delete(BinarySearchTree b, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size(BinarySearchTree b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxDepth(BinarySearchTree b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object minValue(BinarySearchTree b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printPostOrder(BinarySearchTree b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasPathSum(BinarySearchTree b, int sumValue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node mirror(BinarySearchTree b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBST(BinarySearchTree b) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
