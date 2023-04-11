package learningjava;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTypes obj = new MethodTypes();
		obj.add();
		obj.mul(5, 7);
		int subresult= obj.sub();
		int divResult =obj.div(10, 100);
		
		System.out.println("The results of sub is :"+subresult);
		System.out.println("The results of div is :"+divResult);

		
	}
	
	
}


