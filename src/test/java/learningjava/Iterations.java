package learningjava;

import org.testng.annotations.Test;

public class Iterations {
	
	@Test
	public void even() {
		/*
		 * for(initialization ; condition;reinitialization){
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		
	//print all the even numbers  from 1 to 100  using a for loop
		for(int i =1; i<=100;i++) {
			if(i%2==0) {
				System.out.println("even numbers from 1 to 100 are  "+i);
			}
		
		}
	}
		
	@Test	
	public void odd() {
		
		
		
		//print all the odd numbers  from 1 to 100  using a for loop
				for(int i=1;i<=100;i++) {
					if(i%2!=0) {
						System.out.println("odd numbers from 1 to 100 are  "+i);
					}
				}
	}
		
		
		
		
	}


