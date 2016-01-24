package BinaryTree;
/** 
 * 
 * @author UJ
 *
 * @param <T>
 */

import java.util.*;
import java.lang.*;


public class BinarySearchTree <T extends Comparable<? super T> > implements IBTreeInterface<T>{
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
	public Node<T> insert(BinarySearchTree b, T value) {
		if(isTreeEmpty()){
			setRoot(new Node<T>(value));
			return getRoot();
		}
		else{
			return insertNodeToTree(getRoot(),value);
		}
	}
	
	public Node<T> insertNodeToTree(Node<T> treeNode, T value){
		T data = treeNode.getData();
		if( value.compareTo(data) >= 0){
			if(treeNode.getRight()==null){
				Node<T> newNode = new Node<T>(value);
				newNode.setRight(newNode);
				return newNode.getRight();
			}
			else{
				return insertNodeToTree(treeNode.getRight(),value);
			}
		}
		else{
			if(treeNode.getLeft()==null){
				Node<T> newNode = new Node<T>(value);
				newNode.setLeft(newNode);
				return newNode.getLeft();
			}
			else{
				return insertNodeToTree(treeNode.getLeft(),value);
			}
		}
	}
	
	public Node<T> lookUpUtil(Node curNode, T value){
		if(curNode == null){
			return null;
		}
		else if(curNode.getData() == value){
			return curNode;
		}
		//Need to check which casting is done here!!!
		else if(((Comparable<? super T>) curNode.getData()).compareTo(value) >= 0){
			return lookUpUtil(curNode.getLeft(), value);
		}
		else
			return lookUpUtil(curNode.getRight(), value);
	}
	
	@Override
	public Node<T> lookUp(Node b, T value){
		Node<T> curNode = root;
		return lookUpUtil(curNode,value);
	}

	@Override
	public Node<T> delete(BinarySearchTree b, T value) {
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
	public T minValue(BinarySearchTree b) {
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
