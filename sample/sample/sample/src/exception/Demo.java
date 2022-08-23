package exception;

public class Demo {

	public static void main(String[] args) {
		
		try {
			
		int data=100/0;
		
		}catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		

		
		
		try {
			
			String str=null;
			System.out.println(str.length());
			
			}catch(NullPointerException e)
			{
			System.out.println(e);
			}
		

		try {
			
			String str="abc";
			System.out.println(Integer.valueOf(str));
			
			}catch(NumberFormatException e)
			{
			System.out.println(e);
			}
		
		
            try {
			
			int a[]=new int[2];
			a[0]=10;
			a[1]=20;
			System.out.println(a[2]);
			
			}catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println(e);
			}
            
            
            
            try {
    			
            	
            	try {
            		
            	}catch(Exception e)
            	{
            		
            	}
    			
    			
    			}catch(ArrayIndexOutOfBoundsException e)
    			{
    			System.out.println(e);
    			}
            catch(NumberFormatException e)
			{
			System.out.println(e);
			}
            catch(NullPointerException e)
			{
			System.out.println(e);
			}catch(ArithmeticException e)
    		{
				System.out.println(e);
				}
            catch(Exception e)
            {
            	
            }



		
		
		
	}

}
