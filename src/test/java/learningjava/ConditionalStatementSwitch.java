package learningjava;

import java.util.*;

import org.testng.annotations.Test;

public class ConditionalStatementSwitch {
	@Test
	
	public void switchLearning() {
		
		Scanner A =new Scanner(System.in);
		
		System.out.println("Enter the days");
		
		int day = A.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			//break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Error"); 
		}
			
			
		}
		
	}


