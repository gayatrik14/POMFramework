package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.testng.annotations.Test;

public class Assigsnments {
	@Test
	public void reverse() {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		char[] ch = A.toCharArray(); // ch[] = ['a','p','p','l','e']
		for (int i = ch.length-1; i >= 0; i--) {

			System.out.print(ch[i]);

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
	public void duplicateCharacters()
	{
		String str= "liril";
		char[] chArray= str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character ch :chArray)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch) +1);
			}
			else
			{
				map.put(ch, 1); //(L,1) (i,1), (r,1), (i,2), (l,2)
			}
		}
		
		System.out.println(map);
		
	}

	@Test
	public void palindrome() {
		String rev="";
			String str = "malayalama";
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      rev = rev + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(rev.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
	

}
	@Test
	public void largest() {
		
		Scanner sc = new Scanner(System.in);
		int [] num = new int[3];
		int len = num.length;
		for(int i=0;i<=len-1;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<=len-1;i++) {
			for(int j=i+1;j<=len-1;j++);
			
			if(num[i]>0) {
				System.out.println(num[i]+"is grester");
			}
		}
		
	}
	
	@Test
	public void searchElementInArrayList() {
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("guvi");
		strList.add("guru99");
		strList.add("udmey");
		strList.add("javatpoint");
		
		System.out.println(strList.contains("guvi"));
		System.out.println(strList.contains("codingpoint"));
		
	}
	@Test
	public void  sortArray() {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(33);
		arrList.add(3);
		arrList.add(45);
		
		arrList.sort(null);
		
		System.out.println(arrList);
	}
	
	
	@Test
	public void  portionOfaArray() {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(11);
		arrList.add(12);
		arrList.add(13);
		arrList.add(14);
		arrList.add(15);
		System.out.println(arrList);
	System.out.println(arrList.subList(0, 3));	
		
	}
	
	@Test
	public void  swapArray() {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(33);

		int a = arrList.get(0);
		int b = arrList.get(1);
		System.out.println("values of a before swapping "+a);
		System.out.println("values of b before swapping "+b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap "+a);
		System.out.println("after swap "+b);
		
	}
	@Test
	public void  toModifyAnyNumber() {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
		
		System.out.println("array list before modification  " +arrList);
		
		arrList.set(1, 60);
		
		System.out.println("array list after modificition  "+arrList);
		
	}
	
	
	@Test
	public void appendUsingLinkedList() {
		
		LinkedList<String> str = new LinkedList<String>();
		str.add("apple");
		str.add("orange");
		str.add("mango");
		str.add("grapes");
		str.add("kiwi");
		System.out.println("before appending the list "+str);
		
		str.addLast("banana");
		
		System.out.println("after appending the list "+str);
	}
	
	

	@Test
	public void iterateUsingLinkedList() {
		
		LinkedList<Integer> num = new LinkedList<Integer>();
	
		for(int i=0;i<=6;i++) {
			num.add(i);
			
		}
		System.out.println(num);
	}
	
	@Test
	public void aaa() {
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int count = 0;
		 int[] num = new int[n];   
	        for(int i=0;i<num.length-1;i++){
	            num[i] = sc.nextInt();
	        }
	        
	        for(int i=0;i<num.length-1;i++) {
	        if(num[i]%2==0 && num[i]%3==0 && num[i]%5==0){
	         count=1;
	        }
	        if(count==1) {
	        	
	        	 System.out.print(1);
	        	
	        }
	        else
	        {
	            System.out.print(0);
	        }
	}
	}

	@Test
	public void cc() {
		Scanner A = new Scanner(System.in);
		int a = A.nextInt();
		int b = A.nextInt();
		int c = A.nextInt();
		int num = (a * b);

		System.out.println(Math.floorMod(num, c));

	}
	@Test
	public void ccww() {
		Scanner A = new Scanner(System.in);
		  int[] n = new int[10];
		  n[0] =  A.nextInt();
		  n[1] =  A.nextInt();
		  n[2] =  A.nextInt();
		  n[3] =  A.nextInt();
		  n[4] =  A.nextInt();
		  n[5] =  A.nextInt();
		  n[6] =  A.nextInt();
		  n[7] =  A.nextInt();
		  n[8] =  A.nextInt();
		  n[9] =  A.nextInt();
		 
		  int temp=0;
	        for(int i=0;i<=n.length-1;i++)
	        for(int j=i+1;j<=n.length-1;j++){
	            if(n[i]<n[j])
	            {
	               temp=n[i];
	               n[i]=n[j];
	               n[j]=temp;
	            }
	            
	            
	        }
	        System.out.println(temp);

	}
	}


	

