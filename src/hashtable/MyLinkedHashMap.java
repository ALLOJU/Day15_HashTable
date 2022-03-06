package hashtable;

import java.util.ArrayList;

public class MyLinkedHashMap<K,V>{
	/**
	 * MyLinkedHashMap -creating constructor and assigning values to the declared variables
	 * getBucketIndex - this implements hash function to find index for a key
	 * get(key) - this method is used get the value for the given key
	 * add(K key,V value) -adds the key and value to linked hash map using index of the bucket
	 * 
	 *  @param key - key used to get the value of linked hash map
	 *  @param value -- value of the map to add into the hash map
	 *  @return - value of the hashmap
	 */

	/**
	 * declaring variables
	 */
	final int numBuckets;
	ArrayList<MyLinkedList<K> > myBucketArray;
	/**
	 * creating constructor and assigning values to the declared variables
	 */
	public MyLinkedHashMap() {
		this.numBuckets =80;
		this.myBucketArray=new ArrayList<>(numBuckets);
		//creating empty linked list
		for(int i=0;i<numBuckets;i++)
		{
			this.myBucketArray.add(null);
		}
	}
	/**
	 * this implements hashfunction to find index for a key
	 * using hashcode value
	 */
	public int getBucketIndex(K key) {
		int hashCode= Math.abs(key.hashCode());
		int index=hashCode % numBuckets;
		return index;
	}
	/**
	 * this method is used get the value for the given key
	 * @param key - key used to get the value of linked hash map
	 * @return - value of the hashmap
	 */
	public V get(K key) {
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null)
			return null;
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)myLinkedList.search(key);
		return (myMapNode==null)? null :myMapNode.getValue();
	}
	/**
	 * adds the key and value to linked hashap using index of the bucket
	 * @param key - key of the map
	 * @param value -- value of the map to add
	 */
	public void add(K key,V value) {
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null) 
		{
			myLinkedList=new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)myLinkedList.search(key);
		if(myMapNode==null) {
			myMapNode=new MyMapNode<>(key,value);
			myLinkedList.append(myMapNode);
		}
		else
		{
			myMapNode.setValue(value);
		}

	}
	@Override
	public String toString() {
		return "MyLinkedHashMap List {"+myBucketArray+'}';
	}

}
