package interviewQuestionPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Vowels {
	
	@Test
	public void toCheckIfVowelIsPresent()
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		boolean flag=false;
		for(int i=0;i<=ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o'|| ch[i]=='u') {
				flag=true;
				break;
			}
		}
			if(flag==true) {
				System.out.println("vowels is present");
			}
			else
			{
				System.out.println("vowels is not present");
			}
		
		}
	
	@Test
	public void toCountnoOfTimesVowelIsPresent() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		int[] count = new int[5];
		for(int i=0;i<=ch.length-1;i++) {
			
			if(ch[i]=='a' || ch[i]=='A') {
				count[0]++;
			}
			
			else 
				if (ch[i]=='e' || ch[i]=='E') {
				count[1]++;
				}
				else
					
				if(ch[i]=='i' || ch[i]=='I') {
					count[2]++;
				}
				else
					if(ch[i]=='o'|| ch[i]=='O') {
						count[3]++;
					}
					else
						if(ch[i]=='u' || ch[i]=='U'){
							count[4]++;
						}
		}
		System.out.println("Char a is present "+count[0]+" times");
		System.out.println("Char e is present "+count[1]+" times");
		System.out.println("Char i is present "+count[2]+" times");
		System.out.println("Char o is present "+count[3]+" times");
		System.out.println("Char u is present "+count[4]+" times");
		
	}
	}
