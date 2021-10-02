package salary;

public class Employee {
	
	String name;
	double salary;
	int  workHours, hireYear;
	Employee e;
	
	public Employee(String name, double salary, int workHours, int hireYear) 
	{
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	boolean isCheck()
	{
		return(this.salary > 0 && this.workHours > 0 && this.hireYear > 0);
	}
	
	
	double tax(double salary)
	{
		if(this.salary < 1000)
			return 0;
		else
			return this.salary * 0.03;
		
	}
	
	int bonus(int workHours)
	{
		if(this.workHours <=40)
			return 0;
		else
			return this.workHours * 30;
	}
	
	double raiseSalary(int hireYear, double salary)
	{
		int year = 2021;
		
		if(year - this.hireYear < 10)
			return this.salary * 0.05;
		
		else if(9 < year - this.hireYear && year - this.hireYear< 20)
			return this.salary * 0.1;
		else
			return this.salary * 1.5;
		
	}
	
	double salaryWithTaxesAndBonuses()
	{
		return this.salary - tax(this.salary) + bonus(workHours);
	}
	
	double totalSalary()
	{
		return this.salary + raiseSalary(this.hireYear, this.salary) +  bonus(workHours) -  tax(this.salary);
	}
	
	
	void run()
	{
		if(isCheck())
		{
			System.out.println("Name and surname: " + this.name + "\n"
					+ "Salary: " + this.salary + "\n"
					+ "Work Hours: " + this.workHours + "\n"
					+ "Hire Year: " + this.hireYear + "\n"
					+ "Tax: " + tax(this.salary) + "\n"
					+ "Bonus: " + bonus(this.workHours) + "\n"
					+ "Raise: " + raiseSalary(this.hireYear, this.salary) + "\n"
					+ "Salary with taxes and bonuses: " + salaryWithTaxesAndBonuses() + "\n"
					+ "Total salary: " + totalSalary() + "\n");
		}
	}

}
