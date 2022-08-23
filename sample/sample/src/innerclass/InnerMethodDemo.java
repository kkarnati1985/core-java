package innerclass;




class Inner
{
	
int data =200;	
	void display()
	{
		class Local
		{
			void msg()
			{
				System.out.println("Hello"+data);
			}
		}
		Local l=new Local();
		l.msg();
	}
}

public class InnerMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Inner inner =new Inner();
     inner.display();

	}

}
