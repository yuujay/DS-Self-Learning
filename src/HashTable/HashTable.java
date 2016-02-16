package HashTable;

import java.util.ArrayList;

public class HashTable<K,V> {
	
	private ArrayList<LinkedListNode<K,V>> hashKeyList;

	public ArrayList<LinkedListNode<K, V>> getArrList() {
		return hashKeyList;
	}

	public void setArrList(ArrayList<LinkedListNode<K, V>> arrList) {
		this.hashKeyList = arrList;
	}			
	
	public HashTable(int size){
		hashKeyList = new ArrayList<>(size);		
		for(int i=0; i<size;i++){			
			hashKeyList.add(null);
		}
	}
	
	/*
	 * Operations supported
	 * 1.Put
	 * 2.Get
	 * 3.Remove
	 */
	
	public void put(K key, V value){
		LinkedListNode<K, V> node = getNodeForKey(key);		
		if(node != null){
			node.setValue(value);
			return;
		}		
		node = new LinkedListNode<K,V>(key, value);
		int index = getIndexForKey(key);		
		node.setNext(hashKeyList.get(index));		
		hashKeyList.set(index, node);
	}
	
	public int getIndexForKey(K key){
		return Math.abs(key.hashCode() % hashKeyList.size());
	}
	
	public LinkedListNode<K,V> getNodeForKey(K key){		
		int arrLocIndex = getIndexForKey(key);
		LinkedListNode<K, V> node = hashKeyList.get(arrLocIndex);
		while(node != null){			
			if(node.getKey() == key){
				return node;
			}
			node = node.getNext();
		}
		return null;		
	}
	
	public V get(K key){			
		LinkedListNode<K, V> node = getNodeForKey(key);
		if(node == null){
			return null;
		}		
		return node.getValue();
	}
	
	public void remove(K key){		
		int indexNode = getIndexForKey(key);		
		LinkedListNode<K, V> cur = getNodeForKey(key);
		//Check if the key is first element in the arrayList.
		if(hashKeyList.get(indexNode).getKey() == key ){
			hashKeyList.set(indexNode, cur.getNext());
			return;
		}
		else{
			LinkedListNode<K, V> prev = hashKeyList.get(indexNode);			
			System.out.println();
			while(prev.getNext() != null){
				if(prev.getNext().getKey() == key){
					prev.setNext(prev.getNext().getNext());
				}
				prev.setNext(prev.getNext());		
			}
		}					
	}	
}
