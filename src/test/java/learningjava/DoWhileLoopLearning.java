package learningjava;

import org.testng.annotations.Test;
import java.util.*;


public class DoWhileLoopLearning { //Exit Check Loop
	
	@Test
	public void dowhileloop() {
		
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt();
		 int i =100;
				 do {
					System.out.println(i); 
					 i = i+2;
				 }while(i<A);
		
		
	}

}
