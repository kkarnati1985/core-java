package wrapperobject;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10; //primitive datatype
		//int,long,double.float,short,boolean,char
		//Integer,Long,Double, Float,Short, Boolean, Character // respective wrapper class for primitive databtypes
		Integer wrapObjA= Integer.valueOf(a); // object
		
		Integer wrapObjAA= a; //autoboxing
		
		System.out.println(a);
		System.out.println(wrapObjA);
		System.out.println(wrapObjAA);
		
		
		
		Integer b= new Integer(20);
		int primitiveB= b; //unboxing
		System.out.println(b);
		System.out.println(primitiveB);
		
		
	}

}
