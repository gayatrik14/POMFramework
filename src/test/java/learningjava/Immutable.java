package learningjava;

public class Immutable {

	public static void main(String[] args) {
		String str ="hi";
		str.concat("hello");
		System.out.println(str);
		
		String str1 =  str.concat("hello");
		System.out.println(str1);
	}
}
