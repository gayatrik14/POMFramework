package exceptionHandling;

public class ArrayIndexOut {
	
	public static void main(String[] args) {
		int[] b = new int[4];
		b[0] = 2;
		b[1] = 3;
		b[2] = 4;
		b[3] = 5;
		try {
			b[4]=33;
		
		System.out.println(b[4]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(b[0]);
		System.out.println(b[2]);
		
	}

}
