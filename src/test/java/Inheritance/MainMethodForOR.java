package Inheritance;

public class MainMethodForOR {
	
	public static void main(String[] args) {
		
		MethodORChildClass mr = new MethodORChildClass();
		int addres = mr.add(30, 20);
		
		System.out.println(addres);
		mr.diplayparentclassdetails();
	}

}
