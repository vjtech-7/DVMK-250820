package Day3;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee Vijay;
		
		Vijay = new Employee();
		Vijay.Bonus=1000;
		Vijay.Salary=20000;
		
		Vijay.CalculateGross();
		//----------
		Employee Dhruv;
		
		Dhruv = new Employee();
		Dhruv.Salary=20000;
		Dhruv.Bonus=5000;
		int total=Dhruv.CalcSalary();
		System.out.println("Total Salary: " + total);	

	}

}
