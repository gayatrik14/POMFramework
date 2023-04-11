package testNgLearning;

import org.testng.annotations.Test;

public class GroupLearning1 {
	
	@Test (groups = "smoke")
	public void fruits()
	{
		System.out.println("apple");
	}
	@Test
	public void veg()
	{
		System.out.println("carrots");
	}

}
