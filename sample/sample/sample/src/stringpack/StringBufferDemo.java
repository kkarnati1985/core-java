package stringpack;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//mutable
		
		
		StringBuffer strBuffer= new StringBuffer("Sam");
		
		//strBuffer //heap 2323 "Sam"
		//strBuffer //heap 2323 " Samkumar"
		
		
		strBuffer.append("Kumar");
		
		
		System.out.println(strBuffer);
	}

}
