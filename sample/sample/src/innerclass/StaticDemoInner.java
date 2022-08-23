package innerclass;

class OuterTest
{
	
	static int data=200;
	
	
	static class InnerTest
	{
		void msg()
		{
			System.out.println("Hello"+ data);
		}
	}
	
	
}




public class StaticDemoInner {

	public static void main(String[] args) {
		
OuterTest.InnerTest in= new OuterTest.InnerTest();
in.msg();
	}

}
