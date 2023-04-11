package interviewQuestionPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Fibonacci {
	
	@Test
	public void fb() {
        int num, a = 0,b=0, c =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times");
        num = sc.nextInt();
        System.out.println("Fibonacci Series of the number is:");
        
        for (int i=0; i<num; i++) {
            a = b; //a=
            b = c;	//b=1
            c = a+b; //c=1
            System.out.print(a + " ");    //if you want to print on the same line, use print()
        }       
    }

}
