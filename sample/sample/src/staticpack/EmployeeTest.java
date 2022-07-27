package staticpack;




class Employee
{
	int employeeId;
	String employeeName;
	
	static String company;
	//
	
	Employee(int employeeId,String employeeName)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	
	void display()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(company);
	}
	
	
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee.company="Amazon";
		
		Employee employee = new Employee(123,"sam");
		employee.display();
		
		Employee employee2 = new Employee(124,"ram");
		employee2.display();
		
		Employee.company="Google";
		employee.display();
		
		employee2.display();
		
		
		

	}

}
