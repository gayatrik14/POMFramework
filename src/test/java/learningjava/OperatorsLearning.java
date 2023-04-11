package learningjava;

import org.testng.annotations.Test;

public class OperatorsLearning {
	
	int a=10;
	int b=15;

	@Test
	public void operators() {
		
		
		//Arithmetic operators
		int c=a+b;
		System.out.println(c);
		
		
		//Relational Operator
		if(a<=10)
		{
			if(a%2==0) {
				System.out.println("passed");
			}
		}
	
		//Logical Operators 
		if(b<10 && a%2==0) {
			System.out.println("passed both the cases");
		}
		
		if(b<10 || a%2==0) {
			System.out.println("passed one of the cases");
		}
		
	}

}
