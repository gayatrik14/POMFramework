package codekatalearning;

import java.util.*;

import org.testng.annotations.Test;

public class InOuQ3 {
	@Test
	public void xyz() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of arraya nd k va;ue");
		int[] a = new int[5];
		int b = sc.nextInt();

		System.out.println("enter the array values");
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		a[4] = sc.nextInt();

		System.out.println(Arrays.toString(a));

	}

	@Test
	public void xer() {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][2];
		a[0][0] = sc.nextInt();
		a[0][1] = sc.nextInt();

		/*
		 * a[1][0]=sc.nextInt(); a[1][1]=sc.nextInt();
		 * 
		 * a[2][0]=sc.nextInt(); a[2][1]=sc.nextInt();
		 */

		System.out.println(a[0]);

	}

	@Test
	public void ip5() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
	/*	a[0] = sc.nextLine();
		a[1] = sc.nextLine();
		a[2] = sc.nextLine();*/
		char[] ch=a.toCharArray();
	int	b=ch.length;
	
	for(int i=0;i<=b;i++)
	{
	System.out.println((ch[i]));
	}
	//System.out.println(b);

	}
	@Test
	public void ip6() {
		  Scanner x = new Scanner(System.in);
		    
	       String A = x.next();
	       String Ab = A.replaceAll("/s","");
	       char[] ch= Ab.toCharArray();
	       int count= 0;
	       for(int i=0;i<ch.length;i++)
	       {
	           count++;
	       }
	    
	    System.out.println(count);    
	    }
	
}

