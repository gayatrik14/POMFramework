package testNgLearning;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ArithmeticOperations {


		
		@Test(groups = {"smoke","critical usecase"})
		public void sumTwoNo() {
			
			System.out.println(2+3);
			
		}
		
		@Test(groups = {"critical usecase"})
		public void subTwoNo() {
			
			System.out.println(2-3);
			
		}
		
		@Test(groups = {"smoke"})
		public void mulTwoNo() {
			
			System.out.println(2*3);
			Assert.assertEquals(5-4, 1);
		}
		
		@Test
		public void divTwoNo() {
			
			System.out.println(2/3);
			
		}

		

		@Test
		public void sumThreeNo() {
			
			System.out.println(2+3+4);
			
			
		}
		
		@Test
		public void subThreeNo() {
			
			System.out.println(5-2-2);
			
		}
		
		@Test
		public void mulThreeNo() {
			
			System.out.println(2*3*4);
			
		}
		
		@Test
		public void divThreeNo() {
			
			System.out.println(2/3/5);
			Assert.assertEquals(8*3, 24);
			
		}

		
		
		
	}
