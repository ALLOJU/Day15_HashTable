package hashtable;
/**
 * 
 *Main method for manipulating hashtable using hashmap and linked list
 *@param args - Default Java param (Not used)
 */
public class Test {
	public static void main(String[] args) {
		/**
		 * PROCEDURE
		 * 1.taking some input sentence to find frequancy of words
		 * 2.creating object for  hashmap using new key word
		 * 3.split the sentenses to form array of words
		 * 4.get the value of hashmap using hashmap.get() method
		 * 5.check the condition of value using if else condition
		 * 6.here adding both words and values to the linked list of hashmap
		 * 7.printing the linked list of hashmap values to the console
		 */
		
		/**
		 * 1.taking some input sentence to find frequancy of words
		 */
		String sentence="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		/**
		 * 2.creating object for  hashmap using new key word
		 */
		MyLinkedHashMap<String,Integer> myLinkedHashMap=new MyLinkedHashMap<>();
		/**
		 * 3.split the sentenses to form array of words
		 */
		String[] words = sentence.toLowerCase().split(" ");
		 
		//System.out.println(words);
		for(String word :words) {
			System.out.println(word);
		/**
		 * 4.get the value of hashmap using hashmap.get() method
		 */
			 Integer value=myLinkedHashMap.get(word);
		/**
		 * 5.check the condition of value is null then assigning value to 1 or
		 * it is not null then assigning value to no of times value that word repeated	 
		 */
			value=value==null?1 :value+1;
			 myLinkedHashMap.add(word,value);
			 
		}
		//Integer frequency=myLinkedHashMap.get("to");

		/**
		 * 7.printing the linked list of hashmap values to the console
		 */
		System.out.println("before removing avoidable");
		if(myLinkedHashMap!=null) {
		System.out.println(myLinkedHashMap);
		}
		myLinkedHashMap.remove("avoidable");
		System.out.println("After removing avoidable");
		if(myLinkedHashMap!=null) {
			System.out.println(myLinkedHashMap);
			}
		//System.out.println("frequancy is:"+frequency);
	}
}
