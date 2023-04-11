package learningjava;

public class MethodTypes {
	
	//method WO vany return or arugments
	
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	//method With return or WO arugments
	
		public int sub() {
			int a=10;
			int b=20;
			return a-b;
		}
		
		//method WO return or with arugments
		
		public void mul(int a, int b) {
			System.out.println(a*b);
		}

		//method With return or With arugments
		
			public int div(int a , int b) {
				
				return (a/b);
			}
			

}
