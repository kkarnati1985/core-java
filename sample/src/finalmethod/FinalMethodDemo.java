package finalmethod;


class Bike
{
	
	/*final void run() // final keyword at method level
	{
		System.out.println("Running Bike");
	}*/
}


class Honda extends Bike{
	void run()
	{
		System.out.println("Running Honda");
	}
	
}

public class FinalMethodDemo {

	public static void main(String[] args) {
	
		
		Honda honda= new Honda();
		
		honda.run();
		
		
	}

}
