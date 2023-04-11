package assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Check {
	@Test
	public void tc1() {
		// 1.Write a Java program to associate the specified value with the specified
		// key in a HashMap.

		// create a hashmap and insert values to the hashmap

		try {

			/*
			 * // Create a HashMap HashMap<Integer, String> cars = new HashMap<Integer,
			 * String>();
			 * 
			 * // Put elements to the map // A map cannot contain duplicate keys cars.put(1,
			 * "TATA"); cars.put(2, "Maruti"); cars.put(3, "Mahendra"); cars.put(4,
			 * "Hyundai");
			 * 
			 * System.out.println("Original HashMap :"); System.out.println(cars);
			 * System.out.println();
			 * 
			 * for (Entry<Integer, String> x : cars.entrySet()) {
			 * System.out.println(x.getKey() + "-" + x.getValue()); }
			 */

			HashMap<Integer, String> hm = new HashMap<Integer, String>();

			// put is the method used to insert values to the hashmap

			hm.put(1, "red");
			hm.put(2, "black");
			hm.put(3, "yellow");

			System.out.println(hm);

			for (Entry<Integer, String> eachEntry : hm.entrySet()) {
				System.out.println(eachEntry.getKey() + "--->" + eachEntry.getValue());

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc2() {
		// 2.Write a Java program to count the number of key-value (size) mappings in a
		// map.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");
			cars.put(5, null);

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();

			System.out.println("Size of the Map is : " + cars.size());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc3() {
		// 3.Write a Java program to copy all of the mappings from the specified map to
		// another map.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();

			// Create another HashMap
			HashMap<Integer, String> cars1 = new HashMap<Integer, String>();

			System.out.println("New HashMap-->" + cars1);
			System.out.println();

			// cars1 = (HashMap<Integer, String>) cars.clone();

			cars1.putAll(cars);

			System.out.println("Cloned Hash Map :");
			System.out.println(cars1);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc4() {
		// 4.Write a Java program to remove all of the mappings from a map.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();

			// Removing all the elements from the linked map
			// remove specified key mean use remove()
			System.out.println("After removing Map");
			cars.clear();
			System.out.println(cars);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc5() {
		// 5.Write a Java program to check whether a map contains key-value mappings
		// (empty) or not.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();
			HashMap<Integer, String> cars1 = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap 1 :");
			System.out.println(cars);
			System.out.println();

			System.out.println("Original HashMap 2 :");
			System.out.println(cars1);
			System.out.println();

			if (cars.isEmpty()) {
				System.out.println("Map1 is empty");
			} else
				System.out.println("Map1 not empty");

			if (cars1.isEmpty()) {
				System.out.println("Map2 is empty");
			} else
				System.out.println("Map2 is not empty");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc6() {
		// 6.Write a Java program to get a shallow copy of a HashMap instance.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();

			// Create another HashMap
			HashMap<Integer, String> cars1 = new HashMap<Integer, String>();

			System.out.println("New HashMap-->" + cars1);
			System.out.println();

			cars1 = (HashMap<Integer, String>) cars.clone();

			System.out.println("Shallow copy of a HashMap instance :");
			System.out.println(cars1);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc7() {
		// 7.Write a Java program to test if a map contains a mapping for the specified
		// key.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println(cars.get(3));
			//cars.keySet();
			//cars.values();

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();

			System.out.println(cars.containsKey(1));
			System.out.println(cars.containsKey(7));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc8() {
		// 8.Write a Java program to test if a map contains a mapping for the specified
		// value.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();

			System.out.println(cars.containsValue("TATA"));
			System.out.println(cars.containsValue("BMW"));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc9() {
		// 9.Write a Java program to create a set view of the mappings contained in a
		// map.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();

			// Creating set view of map
		    Set<Entry<Integer, String>> set = cars.entrySet();
			// Set set = cars.entrySet();

			// Set View of Map
			System.out.println("Set View of Map :");
			System.out.println(set);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc10() {
		// 10.Write a Java program to get the value of a specified key in a map.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();

			System.out.println("Getting values of 1,3,4,5 is :");
			System.out.println(cars.get(1));
			System.out.println(cars.get(3));
			System.out.println(cars.get(4));
			System.out.println(cars.get(5));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc11() {
		// 11.Write a Java program to get a set view of the keys contained in this map.

		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();
			
			//Create a set view
			Set<Integer> keys = cars.keySet();
			
			System.out.println("Set view of Keys :");
			System.out.println(keys);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Test
	public void tc12() {
		// 12.Write a Java program to get a collection view of the values contained in
		// this map.
		
		try {
			// Create a HashMap
			HashMap<Integer, String> cars = new HashMap<Integer, String>();

			// Put elements to the map
			cars.put(1, "TATA");
			cars.put(2, "Maruti");
			cars.put(3, "Mahendra");
			cars.put(4, "Hyundai");

			System.out.println("Original HashMap :");
			System.out.println(cars);
			System.out.println();
			
			//Create a set view
			Collection<String> values = cars.values();
			
			System.out.println("Set view of Values :");
			System.out.println(values);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		//entrySet() is return of keys and values
		//keySet() is return of keys only
		//values() is return of collection of values

	}

}

