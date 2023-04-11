package interviewQuestionPrograms;

import org.testng.annotations.Test;

public class AmstrongNo {
	
	
	@Test
	public void ams(){  
		  int c=0,a,temp;  
		   int n=15;//It is the number to check Armstrong  
		   temp=n;  
		   while(n!=0)
		   {  
	//rem	
	a=n%10;  //153%10
			//quo		   
			   n=n/10;  //153/10
		    c=c+(a*a*a);
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else 
		        System.out.println("Not armstrong number");   
	}
}
