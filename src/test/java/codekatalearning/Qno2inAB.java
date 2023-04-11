package codekatalearning;

import java.util.*;

import org.testng.annotations.Test;

public class Qno2inAB {

	@Test
	public void qno2() {

		Scanner x = new Scanner(System.in);
		int[] num = new int[7];

		for (int i = 0; i < num.length; i++) {
			num[i] = x.nextInt();
			if (num[i] == 0) {
				System.out.println("Null");
				break;
			}
		}

		for (int i = 0; i < num.length; i++) {
			if (i == 6) {
				System.out.print(num[i]);
				break;
			} else
				System.out.print(num[i] + " ");
		}
	}

	@Test
	public void basicno1() {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	//	String str = "hi hello";
		String str1 = str.trim().replaceAll(" ", "");
		System.out.println(str1);

	}
	
	
	
	
	@Test
	public void io3() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[n];
		
		for(int i=0;i<=num.length-1;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(n);
		System.out.print(k);
		System.out.println(Arrays.toString(num));
		
	}
}