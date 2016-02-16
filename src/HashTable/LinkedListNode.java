package HashTable;

public class LinkedListNode<K,V> {
	
	private K key;
	private V value;
	LinkedListNode<K,V> next;
	
	public LinkedListNode(){
		key = null;
		value = null;
		next = null;
	}
	
	public LinkedListNode(K key, V value){
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public LinkedListNode<K, V> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<K, V> next) {
		this.next = next;
	}
	
}
