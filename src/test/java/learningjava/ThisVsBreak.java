package learningjava;

import org.testng.annotations.Test;

public class ThisVsBreak {
	
@Test
	public void breakLearning() {
		for(int i=0;i<=10;i++) {
			if(i==5) {
				System.out.println("breaking the iteration at 5 as i=5");
				break;
			}
			System.out.println(i);
		}
		
	}

@Test
	public void continuelearning() {
		for(int i=0;i<=10;i++) {
		if(i==5) {
			System.out.println("skipping the iteration at 5 as i=5");
			continue;
		}
		System.out.println(i);
	}
}
}
