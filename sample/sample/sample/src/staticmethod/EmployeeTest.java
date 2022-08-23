package staticmethod;



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
	
	static void sayHello()
	{
		System.out.println(" I am static method"+company);
	}
	
	void display()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(company);
	}
	
	static
	{
		System.out.println("I am static block");
	}
}










public class EmployeeTest {

	public static void main(String[] args) {
		
		
Employee.company="Amazon";
		
		Employee employee = new Employee(123,"sam");
		employee.display();
Employee.sayHello();
		
	}

}
