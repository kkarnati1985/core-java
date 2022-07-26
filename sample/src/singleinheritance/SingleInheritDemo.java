package singleinheritance;


class Animal
{//parent
	void eat()
	{
		System.out.println("Eating");
	}
}


class Dog extends Animal
{ //child 
	void bark()
	{
		System.out.println("Barking");
	}
	
}



public class SingleInheritDemo {

	public static void main(String[] args) {

		
		Animal a = new Animal();
		a.eat();
		
		
		Dog d= new Dog();
		d.bark();
		d.eat();//we a are using the child object to access parent prop 
		
		
	}

}
