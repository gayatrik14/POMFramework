package codekatalearning;

import java.util.*;

import org.testng.annotations.Test;

public class Absolute16 {
	@Test
	public void abc() {
		/*Scanner x = new Scanner(System.in);
		int[] num = new int[7];

		for (int i = 0; i < num.length; i++) {
			num[i] = x.nextInt();	
		}
		System.out.println(num);*/
		 
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
       
        for(int i=0;i<=num.length-1;i++)
        {
            num[i]= sc.nextInt();
        }
        
        for(int i=0;i<=num.length-1;i++)
        {
        	
           if((num[i])%2==0)
           {
        	   System.out.print(num[i]);
           }
       else 
          System.out.println(num[i]);
        }
        
}
	
	@Test
	public void basic1() {
		  Scanner obj = new Scanner(System.in);
	        int[] n = new int[4];
	        
	         System.out.println("enter n values");
	         
	        n[0]=obj.nextInt();
	        n[1]=obj.nextInt();
	        n[2]=obj.nextInt();
	        n[3]=obj.nextInt();
	        
	         System.out.println("enter k value");
	        int k = obj.nextInt();
	        if(k==0){
	            System.out.println("no");
	        }
	        else{
	            System.out.println("yes");
	        }
	}
	@Test
	public void basic8() {
		Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int temp=0;
        int[] n = new int[m];
        for(int i=0;i<m-1;i++) {
        	 temp = n[i] + (i+1);
        }
        System.out.println(temp);
	}
	
}

