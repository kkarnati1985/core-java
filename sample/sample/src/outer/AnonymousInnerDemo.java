package outer;


abstract class Person

{
	public abstract void eat();
	
}

class TestAnon
{
	void test()
	{
	Person p = new Person( ){
		public void eat()
		{
			System.out.println("Eating");
		}
	};
	
	p.eat();
	}
	
}

public class AnonymousInnerDemo {

	public static void main(String[] args) {
		TestAnon t =new TestAnon();
		t.test();

	}

}
