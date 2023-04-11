package testNgLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgGRoupsLearning {
	
	@Test(groups = {"smoke"})
	public void addTwoNo() {
		
		System.out.println(2+3);
		Assert.assertEquals(2+2, 4);
		
	}
	
	@Test(groups = {"smoke"})
	public void subTwoNo() {
		
		System.out.println(2-3);
		Assert.assertEquals(2-2, 5);
		
	}
	
	@Test(groups = {"smoke"})
	public void mulTwoNo() {
		
		System.out.println(2*3);
		Assert.assertEquals(8*3, 24);
		
	}
	
	@Test(groups = {"smoke"})
	public void divTwoNo() {
		
		System.out.println(2/3);
		
		Assert.assertEquals(5/5, 6);
		
	}

	

	@Test
	public void addThreeNo() {
		
		System.out.println(2+3+4);
		Assert.assertEquals(4+6, 10);
		
	}
	
	@Test
	public void subThreeNo() {
		
		System.out.println(5-2-2);
		
		Assert.assertEquals(5-4, 1);
		
	}
	
	@Test
	public void mulThreeNo() {
		
		System.out.println(2*3*4);
		
		Assert.assertEquals(6-5, 15);
		
	}
	
	@Test
	public void divThreeNo() {
		
		System.out.println(2/3/5);
		
	}

	
	
	
}
