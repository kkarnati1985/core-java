package objectandclass;

class Employee
{
	
	int employeeId;
	String employeeName;
	
	
	
	void display()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
	}
	
	
}







public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp =new Employee();
		
		//via referencde
				
		
		emp.employeeId=123;
		emp.employeeName="Sam";
		
		emp.display();

	}

}
