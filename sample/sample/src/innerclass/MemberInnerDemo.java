package innerclass;


class Outer
{
	private int data=100;
	
	class Inner
	{
		void msg()
		{
			System.out.println("Hello "+data);
		}
	}
}



public class MemberInnerDemo {
                                   
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		Outer.Inner in= outer.new Inner();
		
		in.msg();

	}

}
