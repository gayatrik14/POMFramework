package Inheritance;

public class MethodOverriding {
	
	
	public int a=10;
	
	public MethodOverriding() { //Construtor
		System.out.println("I am the parent class construtor");
	}
	
	public int add(int a,int b){
		return (a+b);
		
	}
	
	public int add(int a,int b,int c){      	//ex for method overloading
		return (a+b+c);
		
	}

}
