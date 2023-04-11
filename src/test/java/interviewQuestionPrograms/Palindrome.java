package interviewQuestionPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrome {
	
	
	@Test
	public void plaindromeOfString() {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String rev="";
		char[] ch = str.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}
		
	}
	
	
	@Test
	public void palindromeOfNumber() {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag=0;
		
	}

}
