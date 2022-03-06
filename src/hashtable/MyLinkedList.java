package hashtable;

public class MyLinkedList<K> {
	/**
	 * add - this method is used to add nodes to the starting of the linked list
	 * search - this method is ussed to search a node in the linked list
	 * append - this method is created to add data to linkedList
	 * printNodes - it is used to print nodes of linked list
	 */

	/**
	 * declaring both head and tail nodes
	 */
	private Node<K> head;
	private Node<K> tail;
	/**
	 * this method is used to add nodes to the starting of the linked list
	 * @param newNode - taking input of node to add
	 */
	public void add(Node<K> newNode) {
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		if(this.head==null)
		{
			this.head=newNode;
		}
		else {
			Node<K> tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}
	
	/*
	 * public Node<K> pop(){ Node<K> tempNode =this.head; this.head=head.getNext();
	 * return tempNode;
	 * 
	 * } public Node<K> popLast(){ Node<K> tempNode=head;
	 * while(!tempNode.getNext().equals(tail)) { tempNode=tempNode.getNext(); }
	 * this.tail=tempNode; tempNode=tempNode.getNext(); return tempNode; }
	 */
	/**
	 * this method is ussed to search a node in the linked list
	 * @param key - taking input of key which we need to search
	 * @return
	 */
	public Node<K> search(K key) {
		Node<K> tempNode=head;
		while(tempNode!=null && tempNode.getNext()!=null) {
			if(tempNode.getkey().equals(key)) {
				return tempNode;
			}
		}
		return null;
	}
	/**
	 * append - this method is created to add data to linkedList
	 * @param myNode-input node to add element to end of the linked list
	 */
	public void append(Node<K> myNode) {
		if(this.head==null)
		{
			this.head=myNode;
		}
		if(this.tail==null) {
			this.tail=myNode;
		}
		else
		{
			this.tail.setNext(myNode);
			this.tail=myNode;
		}
		
	}
	/**
	 * it is used to print nodes of linked list
	 */
	public void printNodes()
	{
		System.out.println("My nodes :"+head);
	}
	@Override
	public String toString() {
		return "MyLinkedListNodes {" + head +'}';
	}
	
	

}
