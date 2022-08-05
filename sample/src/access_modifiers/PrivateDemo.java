package access_modifiers;



class A
{
	//private  
	int data;
	
	//private 
	void dipslay()
	{
		System.out.println("Hello");
	}
}

public class PrivateDemo {

	public static void main(String[] args) {
		A a =new A();
		a.data=10;
		System.out.println(a.data);
		a.dipslay();

	}

}
