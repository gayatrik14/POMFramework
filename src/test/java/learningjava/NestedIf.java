package learningjava;

import java.util.*;

import org.testng.annotations.Test;

public class NestedIf {
	@Test
	
	
		public void NestedifelseLearning() {
			
			Scanner A =new Scanner(System.in);
			
			System.out.println("Enter your total marks");
			int total = A.nextInt();
			
			System.out.println("Enter your attendence");
			int attendence = A.nextInt();
			
			if(total>300) {
				if(attendence>75)
			{
				System.out.println("grade is A+");
			}
			else if(attendence>50)
			{
				System.out.println("grade is A");
				
			}
			}
			else if(total>200) {
				System.out.println("grade is B");	
				
			}
			else 
				System.out.println("fail");
			
		}




}
