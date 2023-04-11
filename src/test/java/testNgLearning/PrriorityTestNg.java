package testNgLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrriorityTestNg {
	
	@Test(priority = 0)
	public void sumTwoNo() {
		
		System.out.println(2+3);
		
	}
	
	@Test(priority = 1)
	public void subTwoNo() {
		
		System.out.println(2-3);
		
	}
	
	@Test(priority = 3)
	public void mulTwoNo() {
		
		System.out.println(2*3);
		//Assert.assertEquals(5-4, 1);
	}
	
	@Test(priority = 2)
	public void divTwoNo() {
		
		System.out.println(2/3);
		
	}

	

	@Test(priority = 4, dependsOnMethods = "mulTwoNo")
	public void sumThreeNo() {
		
		System.out.println(2+3+4);
		
		
	}
	
	@Test(priority = 5, alwaysRun = true)
	public void subThreeNo() {
		
		System.out.println(5-2-2);
		
	}
	
	@Test(priority = -1, enabled =false)
	public void mulThreeNo() {
		
		System.out.println(2*3*4);
		
	}
	
	@Test
	public void divThreeNo() {
		
		System.out.println(2/3/5);
		Assert.assertEquals(8*3, 24);
		
	}

}
