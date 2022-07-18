package constructor;


class Employee
{
	
	int employeeId;
	String employeeName;
	
	
	Employee(int employeeId,String employeeName)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	
	
	void display()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
	}
	
	
}







public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp =new Employee(126,"John");
		
		
		emp.display();

	}

}
