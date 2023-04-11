package testNgLearning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterLearning {
	
	@Test
	@Parameters({"fruits","car","city"})
	public void parameterLearning(String brow,String k1,String k2) {
		System.out.println(brow +"   "+k1);
		System.out.println(k1);
		System.out.println(k2);
		
		
	}

}
