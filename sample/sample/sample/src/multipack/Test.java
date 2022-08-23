package multipack;

interface printable
{
	void print();// declartion
	
}

interface drawable
{
	void draw();
	
}
//multiple inheritance
class A6 implements printable,drawable
{
	
	public void print() // definition
	{
		System.out.println("Hello");
	}

	public void draw() {
		System.out.println("Testing");
	}
	
}




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 a6= new A6();
		a6.print();
		a6.draw();

	}

}
