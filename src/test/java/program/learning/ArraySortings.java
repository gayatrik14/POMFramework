package program.learning;
import java.util.*;

import org.testng.annotations.Test;



public class ArraySortings {

		@Test
		public void dessort() {	//descending
			int temp=0;
			int[] arr= {3,14,-2,-5,6,10};
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]<arr[j]) {
						
						temp=arr[i] ;
						arr[i]=arr[j];
						arr[j]=temp;
					}	
				}
			}
				System.out.println(Arrays.toString(arr));
			
		}
	  
		@Test
		public void Aessort() {
			int temp=0;
			int[] arr= {3,14,-2,-5,6,10};
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]>arr[j]) {
						
						temp=arr[i] ;
						arr[i]=arr[j];
						arr[j]=temp;
					}	
				}
			}
				System.out.println(Arrays.toString(arr));
			
		}		
		
		
		
	@Test
		public void valueexchange() {
			int a=10;
			int b=20;
			int temp=0;
			temp=a;
			a=b;
			b=a;
			System.out.println(a);
			System.out.println(b);
			System.out.println(temp);
		}
	}


