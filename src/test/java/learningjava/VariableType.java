package learningjava;

import org.testng.annotations.Test;

public class VariableType {
 int a=10;                       //Global variable
 int b=20;
 
 
 
 @Test
 public void Sum() {
	 
	 
	 int a= 20; // Local variable
	int b=30;
	
	System.out.println("sum is :"+(a+b));
 }
 
@Test
 public void Sum1() {
	
	System.out.println("sum of 1 is :"+(a+b));
 }

}
