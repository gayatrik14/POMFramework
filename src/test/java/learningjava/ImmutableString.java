package learningjava;

public class ImmutableString {
	
	public static void main(String args[])
	{
		String str= "learning";
		str.concat("java");
		String str1=str.concat("java");
		
		
		System.out.println("The value of str is "+str);
		System.out.println("The value of str is "+str1);
		//System.out.println(str+"Learning");
	System.out.println(str.length());
	

		
	}

}
