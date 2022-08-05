package superpack;


class Animal
{
	String color = "white"; // variable 
	
	void eat()
	{
		System.out.println("Eating ");
	}
}




class Dog extends Animal
{
	
	String color = "Black";
	
	
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);
		super.eat();
	}
	
}



public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.printColor();

	}

}
