package interviewQuestionPrograms;

import org.testng.annotations.Test;

public class StarProgram {
	
	@Test
	public void random() {
		
		int num =5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

	@Test
	public void ascending() {
		
		int num =5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

	@Test
	public void descending() {
		
		int num =5;
		for(int i=1;i<=num;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
