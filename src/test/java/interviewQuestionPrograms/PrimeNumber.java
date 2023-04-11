package interviewQuestionPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				flag =true;
				break;
			}
		}
			if(flag==false)
			{
				System.out.println("the given number is prime");
			}
			else
			{
				System.out.println("the given number is not prime");
			}
		}
	}
