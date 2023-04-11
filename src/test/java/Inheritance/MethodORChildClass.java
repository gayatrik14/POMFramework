package Inheritance;

public class MethodORChildClass extends MethodOverriding  {
	
	int a=1000;
	public MethodORChildClass() {
		super();
	}
	
	public void diplayparentclassdetails() {
		
		int a =100;
		System.out.println(super.a +  "value from the parent class" );
		System.out.println(this.a +  " instance value from the child class" );
		System.out.println(a +  "global value from the parent class" );
		super.add(10, 20);
		
		
	}
	public int add(int a,int b) {	//ex for over riding (refer parent class)
		return (a-b);
	}
	

}
