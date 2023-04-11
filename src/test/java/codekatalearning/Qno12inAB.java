package codekatalearning;

import java.util.*;

import org.testng.annotations.Test;

public class Qno12inAB {
	@Test
	
	public void doubt() {

	Scanner A = new Scanner(System.in);
	System.out.println("enter a num");
	int num = A.nextInt();
	int i;
	if (num == 0) {
		System.out.println("Null");
	}
	for (i = 1; i <= num; i++) {
		int B = 9 * i;
		if (i == num) {
			System.out.print(B );
			break;
		}
		else
			System.out.print(B + " " );
	

	}

}
}
