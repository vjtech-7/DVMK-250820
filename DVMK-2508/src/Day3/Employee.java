package Day3;

public class Employee {
	
	int Salary;
	int Bonus;
	
	void CalculateGross() {
		
		System.out.println("Total Salary: " + (Bonus+Salary));
	}
	int CalcSalary()
	{
		int gross = Salary+Bonus;
		return gross;
	}
}
