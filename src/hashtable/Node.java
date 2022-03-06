package hashtable;

public interface Node<K> {
	/**
	 * it is interface to declare methods which is implemented in My mapnode
	 * 
	 * @return
	 */
	K getkey();
	void setKey(K k);
	void setNext(Node <K> next);
	Node<K> getNext();

}
