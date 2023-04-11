package learningjava;

public class CollegeDetails {
	

	String name="Nila";
	String regno="1JT1601";
	String address = "Bangalore";
	String contactno ="1234567890";
	int mark;
	int grade;
	static String collegeName = "oxford";
	
	public CollegeDetails(String name, String regno, String address, String contactno, int mark, int grade)
	{
		
		this.name=name;
		this.regno= regno;
		this.address = address;
		this.contactno =contactno;
		this.mark=mark;
		this.address=address;
	}
	
	public void  showValues() {
		System.out.println(name);
		System.out.println(regno);
		System.out.println(address);
		System.out.println(contactno);
		System.out.println(mark);
		System.out.println(grade);
		System.out.println(collegeName);
		
	}


}
