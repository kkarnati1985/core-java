package objectandclass;

class Student
{
	int studentRoll;
	String studentName;
	
	
	void display()
	{
		System.out.println(studentName);
		System.out.println(studentRoll);
	}
}

public class StudentTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Student stu = new Student();
		stu.studentRoll = 07 ;
		stu.studentName ="rahimm";
		stu.display();
	}

}
