/**
 * 
 */
package variable;

/**
 * @author janu
 *
 */
public class StudentTest {
	
	public static void main(String args[])
	
	{
		
		
		Student stu= new Student();
		
		System.out.println(stu.studentId);
		System.out.println(stu.studentName);
		
		System.out.println(Student.school);
		
		stu.display();
	}}



class  Student
{
	
	
	
	//variable
	//static
	static String school="Brilliant";
	
	int studentId=123;//insatnce varibale
	
	String studentName="sam";//ins
	
	
	
	void display()
	{
    int i=10;//local variable  // method local variable
	System.out.println(i);	
	}
	
	//method
	
	
}




