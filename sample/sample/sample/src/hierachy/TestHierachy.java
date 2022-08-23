package hierachy;



class Animal
{
void eat()
{
	System.out.println("Eating");
}
}



class Dog extends Animal
{
	
	void bark()
	{
		System.out.println("Barking");
	}
	
}





class Cat extends Animal
{
	void meaw()
	{
		System.out.println("Meaw");
	}
}

public class TestHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d =new Dog();
		d.bark();
		d.eat();
		
		Cat c =new Cat();
		c.meaw();
		c.eat();
		
		

	}

}
