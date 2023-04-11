package interviewQuestionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

import org.testng.annotations.Test;

public class OddNumbers {
		@Test
	public void odd() {
	
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		
		boolean flag=false;
		for(Integer i :arr) {
			if(i%2==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
				System.out.println("the list consists of only odd numbers");
				
			}
		else {
			System.out.println("The list consists of even number also");
		}
		}
		
	@Test
	public void oddUsingScanner() {
		Scanner sc = new Scanner(System.in);
	
		int n=sc.nextInt();
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0;i<=n;i++) {
			
		}
	}
	}
