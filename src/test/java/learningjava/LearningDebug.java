package learningjava;

import org.testng.annotations.Test;

public class LearningDebug {
	
	@Test
	 public void debuglearnings() {
		
		int mark1 = 100;
		int mark2 = 50;
		int mark3 = 25;
		
		int total = sum(mark1,mark2,mark3);
		
		double avg = total/3;
		char grade = calculategrade(avg);		
		 
		System.out.println("Student grade is "+grade);
	 }

	private char calculategrade(double avg) {
		// TODO Auto-generated method stub
		char grade;
		if(avg>75) {
			grade = 'A';
		}
		else if(avg>50) {
			grade = 'B';
		}
		else 
			grade ='C';
		
		return grade;
	}

	private int sum(int mark1, int mark2, int mark3) {
		// TODO Auto-generated method stub
		return mark1+mark2+mark3;
	}

}
