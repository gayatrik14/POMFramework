package interviewQuestionPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.testng.annotations.Test;

public class ArraySorting {
	
	@Test
	public void sort() {
		
		int[] arr = new int[5];
		arr[0]=2;
		arr[1]=6;
		arr[2]=1;
		arr[3]=3;
		arr[4]=5;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void ascendingSort() {
		int[] arr = new int[5];
		arr[0]=2;
		arr[1]=6;
		arr[2]=1;
		arr[3]=3;
		arr[4]=5;
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void descendingSort() {
		int[] arr = new int[5];
		arr[0]=2;
		arr[1]=6;
		arr[2]=1;
		arr[3]=3;
		arr[4]=5;
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	

}
