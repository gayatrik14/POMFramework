package exceptionHandling;

public class ArrExceptionLearning {
	
	public static void main(String[] args) {
		int a = 10;
		int b= 0;
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		int c=100;
		int d=10;
		System.out.println(c+d);
	}

}
