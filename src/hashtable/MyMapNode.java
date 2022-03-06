package hashtable;

public class MyMapNode<K,V> implements Node<K> {

	/**
	 * delcaring key ,value and next values of my map node
	 */
	K key;
	V value;
	MyMapNode<K,V> next;
	/**
	 * creating parametrized constructor with key and value pairs 
	 * @param key-  input  key  of the hashmap
	 * @param value -input value of the hashmap
	 */
	public MyMapNode(K key, V value) {

		this.key = key;
		this.value = value;
		next = null;
	}
	/**
	 * getkey() is used to get the value of the given key
	 */
	@Override
	public K getkey() {
		return key;
	}
	/**
	 * set the key value
	 */
	@Override
	public void setKey(K key) {
		this.key=key;
	}


	@Override
	public void setNext(Node<K> next) {
		this.next=(MyMapNode<K, V>) next;
	}

	@Override
	public Node<K> getNext() {
		return next;
	}
	public V getValue()
	{
		return this.value;
	}
	public void setValue(V value) {
		this.value=value;
	}
	/**
	 * to string method is used to print linked list hash map node in a particular manner to display
	 * append method
	 */
	@Override
	public String toString() {
		StringBuilder myMapNodeString=new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key)
		.append("  V=").append(value).append('}');
		if(next!=null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}

}
