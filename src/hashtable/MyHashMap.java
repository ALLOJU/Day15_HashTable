package hashtable;

public class MyHashMap<K,V>{

	/**
	 * get - this  method is used to get the value of given key
	 * add - this method is used add key value to the hashmap
	 * 
	 *  @param key-input of key in hashmap
	 * @return -it returms value in the hashmap
	 */
	//creating object for the linked list
	MyLinkedList<K> myLinkedList;
	//creating constructor
	public MyHashMap() {

		this.myLinkedList = new  MyLinkedList<>();
	}
	/**
	 * this  method is used to get the value of given key
	 * @param key-input of key in hashmap
	 * @return -it returms value in the hashmap
	 */
	public V get(K key) {
		@SuppressWarnings("unchecked")
		MyMapNode<K,V> myMapNode =  (MyMapNode<K,V>) this.myLinkedList.search(key);
		return (myMapNode==null)? null : myMapNode.getValue();

	}
	/**
	 * this method is used add key value to the hashmap
	 * @param key- input of key in the hashmap
	 * @param value -input of value in the hashmap
	 */

	public void add(K key, V value) {
		MyMapNode<K,V> myMapNode =  (MyMapNode<K,V>) this.myLinkedList.search(key);
		if(myMapNode==null) {
			myMapNode =new MyMapNode<>(key,value);
			this.myLinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}

	}
	@Override
	public String toString() {
		return "MyHashMapNodes{"+ myLinkedList+ '}';
	}


}
