package Inheritance;

public class StudentClass {
	
	String stdname;
	String grade;
	String clas;
	
	
	public StudentClass() {
		stdname = "Nila";
		grade = "A";
		clas = "be";
		
	}
	public StudentClass(String stdname , String grade, String clas){ //overloading constructor
		this.stdname=stdname;
		this.grade=grade;
		this.clas=clas;
	}
	
	public void Studentdetails() {
		System.out.println(stdname);
		System.out.println(grade);
		System.out.println(clas);
	}
}
