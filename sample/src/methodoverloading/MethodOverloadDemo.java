package methodoverloading;


class Addition
{
	
	void sum(int a,int b)
	{
		System.out.println("Output"+(a+b));
	}
	
	
	
	void sum(int a,int b,int c)
	{
		System.out.println("Output"+(a+b+c));
	}
	
}


public class MethodOverloadDemo {
	
	public static void main(String args[])
	{
		Addition a= new Addition();
		a.sum(10, 10);	
		a.sum(10, 10,10);
	}

}
