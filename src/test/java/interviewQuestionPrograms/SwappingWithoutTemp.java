package interviewQuestionPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SwappingWithoutTemp {
	@Test
	public void swapWithoutUsingTemp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Values of a and b are "+a+"  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("values of a and b after swaping are :" +a+ "  " +b);
	}
	@Test
	public void swapUsingTemp() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int temp=0;
		System.out.println("Values of a and b are "+a+"  "+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("values of a and b after swaping are :" +a+ "  " +b);
		
		
	}
	
	@Test
	public void prime() {
		int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
}
