package variable;


class  Employee
{
	
	
	
	//variable
	//static
	static String company="Amazon";
	
	int employeeeId=123;//insatnce varibale
	
	String emploeeName="sam";//ins
	
	
	
	void display()
	{
    int i=10;//local variable  // method local variable
	System.out.println(i);	
	}
	
	//method
	
	
}


public class EmployeeTest {
	
	public static void main(String args[])
	
	{
		
		
		Employee emp= new Employee();
		
		System.out.println(emp.employeeeId);
		System.out.println(emp.emploeeName);
		
		System.out.println(Employee.company);
		
		emp.display();
	}
	
	
	
	

}
