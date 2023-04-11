package assignments;

public class MainMethodBasic {

	public static void main(String[] args) {
		
		
		ScientificCalculator sc = new ScientificCalculator();
		int addresult = sc.add(10, 20);
		int add3result = sc.add(10, 20, 30);
		int subresult = sc.sub(30, 20);
		int divresult = sc.div(40, 50, 30);
		
		
		
		
		sc.main("inside main method");
		sc.cos();
		
		
		
		System.out.println("value of addresult is" + addresult);
		System.out.println("value of subresult is" + subresult);
		System.out.println("value of divresult is" + divresult);
		System.out.println("value of add3result is" + add3result);
	}

}
