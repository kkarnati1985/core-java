package methodoverloading;
class flower
{
	void bloom(String a , int b)
	{
		System.out.println("Output"+ " "+ (a +" "+ b));
	}
	void bloom(String a,String b,int c)
	{
		System.out.println("Output"+ " "+ (a +" "+ b +c));
	}
	
}

public class OverloadingPractice
{	
	
		public static void main(String args[])
		{
			flower a= new flower();
			a.bloom("rose", 10);
			a.bloom("red","rose",10);
		}

}
