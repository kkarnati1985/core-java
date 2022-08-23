package stringpack;

public class StringDemo {

	public static void main(String[] args) {

		
		String str ="sam";//literal , String constant pool in java
	
		 String str1="sam";
		
		String strObj= new String ("Ram"); // it will entry in string constant pool + heap
		
		//immutable:
		
		//memory strObj =2323; Ram // heap
		
		//       strObj =2324; Ram Kumar //heap           
		strObj=	strObj.concat(" Kumar");
		
		
		
		System.out.println(str);
		System.out.println(strObj);
		
	}

}
