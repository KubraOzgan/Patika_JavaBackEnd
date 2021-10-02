package java101_StudentInformationSystem;

public class Student {
	
	String name, stuNo;
	String classes;
	Course c1, c2, c3;
	double average;
	boolean isPass;
	
	Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) 
	{
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.average = 0.0;
		this.isPass = false;
		
	}
	
	public void addBulkExamNote(int note1, int note2, int note3)
	{
		if(note1 >=0 && note1 <= 100)
		{
			this.c1.note = note1; 
		}
		
		if(note2 >=0 && note2 <= 100)
		{
			this.c2.note = note2;
		}
		
		if(note3 >=0 && note3 <= 100)
		{
			this.c3.note = note3;
		}
		
	}
	
	public void addVivaNote(int viva1, int viva2, int viva3)
	{
		if(viva1 >=0 && viva1 <= 100)
		{
			this.c1.viva = viva1; 
		}
		
		if(viva2 >=0 && viva2 <= 100)
		{
			this.c2.viva = viva2; 
		}
		
		if(viva3 >=0 && viva3 <= 100)
		{
			this.c3.viva = viva3;
		}
		
	}
	
	public void isPass()
	{	
		printNote();
		
		if(calcAverage() > 55)
		{
			System.out.println("Passed!");
			this.isPass = true;
		}
		else
		{
			System.out.println("Failed!");
			this.isPass = false;
		}
		System.out.println("Avarage: " + this.average + "\n");

	}
	
	public double calcAverage()
	{
		return (this.average = (((this.c1.note * 0.8 + this.c1.viva * 0.2)
				+ (this.c2.note * 0.7 + this.c2.viva * 0.3) + (this.c3.note * 0.6 + this.c3.viva * 0.4)) / 3.0));
	}
	
	public void printNote()
	{
		System.out.println(this.c1.name + " Score: "+ c1.note);
		System.out.println(this.c2.name + " Score: "+ c2.note);
		System.out.println(this.c3.name + " Score: "+ c3.note);
	}
	
}
