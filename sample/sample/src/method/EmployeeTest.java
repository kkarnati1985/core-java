package method;


class Employee
{
	
	int employeeId;
	String employeeName;
	
	
	void assign(int id,String name) {
		employeeId=id;
		employeeName=name;
		
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
		
		Employee emp =new Employee();
		
		//vmethod
		emp.assign(124, "ram");
				
		emp.display();

	}

}
