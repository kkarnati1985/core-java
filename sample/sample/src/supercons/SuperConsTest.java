package supercons;

class Person
{
	int id;
	String name;
	
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}

class Emp extends Person
{
	float salary;
	
	Emp(int id,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
	}
	
	
	void display()
	{
		System.out.println(id +" "+name+" "+salary);
	}
	
	
	
}






public class SuperConsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e= new Emp(123,"Sam",450000f);
		e.display();

	}

}
