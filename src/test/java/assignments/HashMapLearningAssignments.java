package assignments;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HashMapLearningAssignments {
	
	@Test
	public void addHashMap() {	//associate the specified value with the specified key in a HashMap.
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(123,"Bangalore");
		h.put(456, "Mumbai");
		h.put(789, "Chennai");
		h.put(012,"Kerala");
		
		System.out.println(h);
		
	}
	
	@Test
	public void sizeHashMap() {	//to count the number of key-value (size) mappings in a map.
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(123,"Bangalore");
		h.put(456, "Mumbai");
		h.put(789, "Chennai");
		h.put(012,"Kerala");
		
		System.out.println("The size of the map is : "+h.size());
	}
	
	@Test
	public void copyHashMap() {	//to copy all of the mappings from the specified map to another map. 
		
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(123,"Bangalore");
		h.put(456, "Mumbai");
		h.put(789, "Chennai");
		h.put(226,"Kerala");
		
		System.out.println(h);
		
		HashMap<Integer, String> h1 = (HashMap<Integer, String>) h.clone();
		
		System.out.println(h1);
		
	
	}
	
	@Test
	public void removeAllHashMap() {//remove all of the mappings from a map. 
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(123,"Bangalore");
		h.put(456, "Mumbai");
		h.put(789, "Chennai");
		h.put(226,"Kerala");
		System.out.println(h);
		
		System.out.println(h.isEmpty());
		h.clear();

		System.out.println(h);
		
		System.out.println(h.isEmpty());	//check whether a map contains key-value mappings (empty) or not
	}
	
	@Test
	public void shallowCopyHashMap() {
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(123,"Bangalore");
		h.put(456, "Mumbai");
		h.put(789, "Chennai");
		h.put(226,"Kerala");
		
		//to get a shallow copy of a HashMap instance. 
		System.out.println(h.clone());
		
		//to test if a map contains a mapping for the specified key.
	System.out.println(	h.containsKey(123)); //returns true
	System.out.println(	h.containsKey(13)); // returns false
	
	//to test if a map contains a mapping for the specified value. 
	System.out.println(h.containsValue("Bangalore"));	//returns true
	System.out.println(h.containsValue("Mangalore"));	// returns false
		
	//to get the value of a specified key in a map.
	System.out.println(h.get(456));
	
	//to get a set view of the keys contained in this map. 
	System.out.println(h.entrySet());
	
	//to get a collection view of the values contained in this map. 
	System.out.println(h.values());
}
}
