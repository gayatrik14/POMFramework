package learningjava;

import java.util.*;

import org.testng.annotations.Test;

public class ArrayLearning {
	@Test
	public void avgCalculation() {
		double sciencemark = 90;
		double socialmark= 89;
		double mathsmark=88;
		double hindimark =60;
		double englishmark =75;
		double kanmark = 55;
		double total =sciencemark+socialmark+mathsmark+hindimark+englishmark+kanmark;
		double avg = total/6; 
		System.out.println("The avg mark is "+avg);
	}
@Test
	public void usingarray() {
	int[] mark = new int[6];
	mark[0]=100;
	mark[1]=98;
	mark[2]=67;
	mark[3]=76;
	mark[4]=55;
	mark[5]=100;
	
	System.out.println("The length of the array is : "+mark.length);
	System.out.println(Arrays.toString(mark));
		
}



@Test 
	public void usingarrayatruntime() {
	String[] car = new String[5];
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<=car.length-1;i++) {
		System.out.println("Enter the " +i+ " car value ");
		car[i]=sc.nextLine();
	}
	
	System.out.println("list of the car names are :");
	
	for(int i=0;i<=car.length-1;i++) {
		System.out.println("The value of " +i+ " car is "+car[i]);
	}
	
}



@Test
 public void multidimensinoalarray() {
	int[][] matrix = new int[3][3];
	matrix[0][0] = 10;
	matrix[0][1] = 20;
	matrix[0][2] = 30;
	
	matrix[1][0] = 40;
	matrix[1][1] = 50;
	matrix[1][2] = 60;
	
	matrix[2][0] = 70;
	matrix[2][1] = 80;
	matrix[2][2] = 90;
	
	System.out.println(Arrays.toString(matrix[0]));
	System.out.println(Arrays.toString(matrix[1]));
	System.out.println(Arrays.toString(matrix[2]));
}
}