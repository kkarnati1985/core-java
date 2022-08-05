package finalvariable;

class Bike
{
	final int speed=40;
	
	void run()
	{
		//speed =90;
		System.out.println(speed);
	}
	
}


public class FinalVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.run();

	}

}
