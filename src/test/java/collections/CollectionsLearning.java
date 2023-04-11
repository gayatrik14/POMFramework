package collections;

import java.util.*;
import org.testng.annotations.Test;

public class CollectionsLearning {

	@Test

	public void arrayList() {
		
		int a=20;
		Integer b =200;
	/*CRUD operations
	 * 
	 * 
	 * 	
	 */
		
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
//create		
		arrList.add(20);
		arrList.add(60);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
		
		System.out.println(arrList);
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("apple");
		strList.add("banana");
		strList.add("grapes");
		strList.add("chikoo");
		strList.add("mango");
		strList.add("pineapple");
		
		System.out.println(strList);
		
//Read 
		
		System.out.println(arrList.get(2));
		System.out.println(strList.get(3));
		
//Modify 
		arrList.set(2, 90);
		strList.set(3,"watermelon");
		System.out.println(arrList.get(2));
		System.out.println(strList.get(3));
		
//Delete
		//arrList.remove(2);
		//strList.remove(2);
		
		//System.out.println(arrList.get(2));
		//System.out.println(strList.get(2));
		
// to check if a element is present in the 
		System.out.println(strList.contains("watermelon"));
		System.out.println(strList.contains("chikoo"));
		
		
//sorting the elements
		arrList.sort(null);
		System.out.println(arrList);
		
//size of the array
		System.out.println(arrList.size());
		
		
		
//Iterate the Array list using for-each loop
		for(String s : strList) {
			if(s.contentEquals("watermelon"))
			{
			System.out.println("encountered watermelon");
			break;
			}
			System.out.println(s);
		}
		
//Iteration without using loop
		
	Iterator itr = strList.iterator();
	System.out.println("Iteration without looping");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	

	}

	@Test
	public void hashsetlearning() {
		
		Set<String> s = new HashSet<String>();
		s.add("chennai");
		s.add("banglore");
		s.add("NCR");
		s.add("gurgaon");
		s.add("noida");
		s.add("chennai");
		s.add("banglore");
		s.add("NCR");
		
		System.out.println(s);
		
		
	}
	@Test
	
	public void treeSetLearning() {
			Set<String> s = new TreeSet<String>();
			s.add("chennai");
			s.add("banglore");
			s.add("ncr");
			s.add("gurgaon");
			s.add("noida");
			s.add("chennai");
			s.add("banglore");
			s.add("ncr");
			
			System.out.println(s);
			
	}



	@Test
	public void hashMapLearning() {
		
		
		/* Store data in key and value<> where key is unique
		 * any number of null value can be given
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(789, "Bangalore");
		map.put(234, "Mumbai");
		map.put(456, "chennai");
		System.out.println(map);
		
		
		HashMap<String,String> mapp = new HashMap<String,String>();
		mapp.put("Swift", "Maruthi");
		mapp.put("Tiago", "Tata");
		mapp.put("i20","hundai");
		
		System.out.println(mapp);
		System.out.println(mapp.get("i20"));
		System.out.println(map.get(234));
		System.out.println(map.get(120));
		
		mapp.remove("i20");
		System.out.println(mapp);
		
		System.out.println(map.clone());
		
		
		System.out.println("itretaing the values");
		for(Integer i : map.keySet()) {
			System.out.println(i);
		}
		
		for(String s : mapp.keySet()) {
			System.out.println(s);
		}
		
		System.out.println("itretaing the key and get values");
		for(Integer i :map.keySet()) {
			System.out.println(i+ " : "+map.get(i));
		}

	}
	@Test
	public void count() {
		String sent = "Count the number of words in this sentence twice this is";
		String[] words=sent.split(" ");
		Map<String,Integer> wc = new HashMap<String,Integer>();
		
		for(String s: words) {
			if(wc.containsKey(s)) {
				wc.put(s, wc.get(s)+1);
				
			}
			else wc.put(s, 1);
			
		}
		System.out.println(wc);
	}
	
	
	
	@Test
	public void ss() {
		String s1 = new String("hi");
		String s2 = "hi";
		String s3 = s2.intern();
		if(s1==s3 && s2==s3);
		{
			System.out.println("yes");
		}
	}
	
	
	@Test
	public void countOfString() {

		Scanner sc = new Scanner(System.in);
		String B = sc.next();
		int count = 0;
		char[] ch = B.toCharArray();
		for (int i = 1; i <= ch.length; i++) {
			count++;
		}
		System.out.println(count);

	}

}
