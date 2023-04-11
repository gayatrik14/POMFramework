package interviewQuestionPrograms;

import java.util.Scanner;

public class revWithOutUsinginBuilt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rev="";
		System.out.println("Enter the string to reverse");
		String str = sc.next();
		char[] ch = str.toCharArray();
		int len = ch.length;
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println("string after reversal is : "+rev);
		
	}

}
