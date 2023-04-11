package interviewQuestionPrograms;

import java.util.Scanner;

public class ToRemoveSpaceandTrail {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String str1= str.strip();
		
		System.out.println("String before removal of space : "+str);
		System.out.println("String after removal of space : "+str1);
	}
	
}
