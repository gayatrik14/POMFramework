package learningjava;

import java.util.*;

import org.testng.annotations.Test;

public class EvenNoUsingArray {
@Test
	public void arraylearning() {
		int[] num = new int[6];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list of numbers :");
		for(i=0;i<=num.length-1;i++) {
			num[i]=sc.nextInt();
		}
		for(i=0;i<num.length-1;i++) 
		{
			if(num[i]%2==0) 
			{
				System.out.println("Even numbers in the given list are:"+num[i]);
			}
		}
}


@Test

	public void primenumber() {
		int[] num=new int[6];
		int i,m,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list of numbers :");
		
		
		
		for(i=0;i<=num.length-1;i++) {  //To get the value of arrays
			num[i]=sc.nextInt();
		}
		for(i=0;i<=num[i];i++) {
		for(int j=2;j<=num[i];j++) {
			if(num[i]%j==0) {
				flag=1;
				System.out.println(num[i]+ "is not a prime number");
				break;
		}
			else 
			flag =0;
		System.out.println(num[i]+ "is a prime number");
	}
	

		}
}



@Test

	public void primenumbersby() {
		int[] num= {2,3,4,5,6,7,8};
		int i,m,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list of numbers :");
		for(i=0;i<=num.length-1;i++) {
			m=num[i];		
		for(int j=2;j<=num.length-1;j++) {
			if(m%j==0) {
				flag=1;
				System.out.println(m+ "is not a prime number");
				break;
				
	}
			else if(flag==0) {
				System.out.println(m+ "is a prime number");
			}
		}
		}
		
}
}





