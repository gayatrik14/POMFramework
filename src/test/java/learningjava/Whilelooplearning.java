package learningjava;

import org.testng.annotations.Test;
import java.util.*;

public class Whilelooplearning { //EntryCheck Loop

	@Test
	public void whilelearning() {
		
		Scanner A = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = A.nextInt();
		int i=0;
		while(i<=num) {
			if(i%2==0) {
				
				System.out.println("even numbers" +i);
				
			}
			i++;
		}
		
	}
}
