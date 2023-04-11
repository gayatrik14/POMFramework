package interviewQuestionPrograms;

import java.util.Scanner;

public class revOfStringWithInbuilt {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuilder s2 = new StringBuilder();
		s2.append(str);
		
		s2.reverse();
		
		System.out.println(str);
		System.out.println(s2);
		
		
	}

}
