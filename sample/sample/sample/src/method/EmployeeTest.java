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


	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}


	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}


	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
}







public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp =new Employee();
		
		//vmethod
		emp.assign(124, "ram");
		emp.setEmployeeId(1234);
		emp.setEmployeeName("Ravi");
				
		emp.display();

	}

}
