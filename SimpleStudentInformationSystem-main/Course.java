package java101_StudentInformationSystem;

public class Course {
	
	String name, code, prefix;
	int note, viva;
	Teacher teacher; 
	
	Course(String name, String code, String prefix)
	{
		this.name = name; 
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int viva = 0;
	}
	
	public void addTeacher(Teacher teacher)
	{
		if(teacher.branch.equals(this.prefix))
		{
			this.teacher = teacher; 
			printTeacher();
		}
		
		else
		{
			System.out.println("Teacher and course departments do not match");
		}
		
	}
	
	public void printTeacher()
	{
		this.teacher.print();
		/*if(teacher != null)
		{
			System.out.println(this.name + " courses teacher is " + teacher.name);
		}
		else
		{
			System.out.println("No teacher has been assigned for this course.");
		}*/
	}

}
