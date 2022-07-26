package constructor;

class Student
{
	int studentRoll;
	String studentName;
	
	 Student(int rollNum, String stuName)
	{
		studentName = stuName;
		
		studentRoll = rollNum;
	}
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

		Student stu = new Student(01, "ram");
		
		stu.display();
	}

}
