package learningjava;

import java.util.*;

import org.testng.annotations.Test;
public class IfElseLearnings {

		@Test
		
		public void ifelseLearning() {
			
			Scanner A =new Scanner(System.in);
			
			System.out.println("Enter your total marks");
			
			int total = A.nextInt();
			
			if(total>300)
			{
				System.out.println("grade is A");
			}
			else if(total>200)
			{
				System.out.println("grade is B");
			}
			else 
				System.out.println("Fail");	
				
				
			}
			
		}
