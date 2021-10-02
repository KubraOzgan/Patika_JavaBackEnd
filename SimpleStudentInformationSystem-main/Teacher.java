package java101_StudentInformationSystem;

public class Teacher {
	
	String name, mpno, branch;

	Teacher(String name, String branch, String mpno) 
	{
		this.name = name;
		this.branch = branch;
		this.mpno = mpno;
	}
	
	void print()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Number: " + this.mpno);
		System.out.println("Department: " + this.branch + "\n");
	}
	
}
