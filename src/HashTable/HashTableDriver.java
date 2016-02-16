package HashTable;

public class HashTableDriver {

	public static void main(String args[]){
		HashTable<Integer, Integer> h = new HashTable<Integer, Integer>(10);
		h.put(12, 5);
		h.put(32, 25);
		h.put(10 , 15);				
		h.put(22, 15);
		//h.remove(32);
		System.out.println(h.get(10));
	}
}
