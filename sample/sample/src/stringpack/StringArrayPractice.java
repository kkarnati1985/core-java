package stringpack;

import java.util.ArrayList;

public class StringArrayPractice

{   

	public static void main(String[] args) 
	{
		String  favFruit= "mango" ;
		  ArrayList<String> list = new ArrayList<>(); 
		  list.add("mango");
		  list.add("banana");
		  list.add("guva");
		  list.add("apple");
		  System.out.println(list);
		  for(String fruit : list)
		  {
			  if(fruit.equalsIgnoreCase(favFruit))
			  {
				  System.out.println("my favoriate fruit is mango");
			  }
		  }




	}

}
