package calculator.learning;

public class MainMethodBasic {
	
	public static void main(String[] args) {
	
		Addition ad = new Addition();
		Addition.main("hello");
		Addition.main(args);
		
		
		int addResult =ad.add(10, 20);
		int addResult1 =ad.add(10, 20,30);
		System.out.println("output of add is " +addResult);
		System.out.println("output of add3 is " +addResult1);
		
		Subtraction sub = new Subtraction();
		int subResult =sub.sub(30, 10);
		int subResult1 =sub.sub(30, 10,40);
		
		System.out.println("output of sub is " +subResult);
		System.out.println("output of sub3 is " +subResult1);
		
		Multiplication mu = new Multiplication();
		int mulResult =mu.mul(10, 10);
		int mulResult1 = mu.mul(10,23,30);
		System.out.println("output of mul is " +mulResult);
		System.out.println("output of mul3 is " +mulResult1);
		
		
		Division di = new Division();
		int divResult =di.div(100, 100);
		int divResult1 =di.div(100, 100,200);
		
		System.out.println("output of div is " +divResult);
		System.out.println("output of div3 is " +divResult1);
		

}
	
}
