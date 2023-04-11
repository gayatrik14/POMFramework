package assignments;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class HashsetLearningPrograms {
	
	@Test
	public void toAppend() {
		
		HashSet<String> s = new HashSet<String>();
		s.add("apple");
		s.add("banana");
		s.add("kiwi");
		s.add("watermelon");

		System.out.println(s.add("mango"));
		System.out.println(s);
		
	}
	@Test
	public void iterate() {
		
		HashSet<Integer> itr = new HashSet<Integer>();
		itr.add(2);
		itr.add(4);
		itr.add(5);
		itr.add(3);
		itr.add(44);
		
		for(Integer i :itr)
		{
			System.out.println(i);
		}
		
	}
	
	@Test
	public void noOfElements() {
		HashSet<Integer> itr = new HashSet<Integer>();
		itr.add(1);
		itr.add(2);
		itr.add(3);
		itr.add(33);
		itr.add(44);
		
		System.out.println(itr);
		int a=itr.size();
		
		System.out.println(a);
		
		//clone of the set
	itr.clone();
	System.out.println(itr);

	}
	
	
	@Test
	public void removeAll() {
		HashSet<Integer> itr = new HashSet<Integer>();
		itr.add(1);
		itr.add(2);
		itr.add(3);
		itr.add(33);
		itr.add(44);
		
		
		System.out.println("list before remove method :"+itr);
		
		System.out.println(itr.isEmpty());	//this will return false as the set is not empty
		
		itr.removeAll(itr);
		
		System.out.println("List After "+itr);
		
		//to check if the set is empty or not
		
		System.out.println(itr.isEmpty());
	}
	
	@Test
	public void array() {
		HashSet<String> s = new HashSet<String>();
		s.add("apple");
		s.add("banana");
		s.add("kiwi");
		s.add("watermelon");
		s.add("mango");
		
		System.out.println(s);
		s.toArray();
		
		System.out.println(s);
	}
	
}
