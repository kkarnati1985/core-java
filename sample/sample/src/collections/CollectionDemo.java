package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {

		
		
		//List
		
		//ArrrayList - faster in search
		
		List<String> strList =new ArrayList<String>();
		
		strList.add("Sam");
		strList.add("Ram");
		
		for(String str:strList)
		{
			System.out.println(str);
		}
		
		
		//LinkedList -faster in add/remove
		
      List<String> strListLinked=new LinkedList<String>();
		
      strListLinked.add("Sam");
      strListLinked.add("Ram");
		
		for(String str:strListLinked)
		{
			System.out.println(str);
		}
		
		
		
		
		//Stack
		
		Stack stk =new Stack();
		
		stk.push("Sam1");
		stk.push("Ram1");
		

		for(Object str:stk)
		{
			System.out.println(str.toString());
		}
		
		stk.pop();//remove top element in stack;

		for(Object str:stk)
		{
			System.out.println(str.toString());
		}
		
		
		
		
		
		//Vector
          Vector vector = new Vector();	
		  vector.add("Sam2");
		  vector.add("Ram2");
		  for(Object str:vector)
			{
				System.out.println(str.toString());
			}
		  
		
		
		
		//Set - will not allow duplicates
		  
		 // HashSet - 
		  Set<String> strSet = new HashSet<String>();
		  
		  strSet.add("SamSet");
		  strSet.add("SamSet");
		  strSet.add("RamSet");
		  
		  for(String str:strSet)
		  {
			  System.out.println(str);
		  }
		  
		  
		  //LinkedHashSet -
		  
 Set<String> strSetLink = new LinkedHashSet<String>();
		  
 strSetLink.add("SamSetLink");
 strSetLink.add("SamSetLink");
 strSetLink.add("RamSetLink");
		  
		  for(String str:strSetLink)
		  {
			  System.out.println(str);
		  }
		  
		  
		  
		  //TreeSet-
		  Set<String> strSetTree = new TreeSet<String>();
		  
		  strSetTree.add("SamSetTree");
		  strSetTree.add("SamSetTree");
		  strSetTree.add("RamSetTree");
		 		  
		 		  for(String str:strSetTree)
		 		  {
		 			  System.out.println(str);
		 		  }
		  
		  
		  
		
		
		//Map - key value pair
		 		  
		 		  
		 		  //HashMap
		 		  //LinkedHashMap
		 		  //TreeMap
		 		  //HashTable
		 		  
		 		  
		 		  
		 		  
	}

}
