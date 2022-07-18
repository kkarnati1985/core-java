package controlstatement;

public class ControlStmtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//if, if else , if else if else, while ,do-while, for loop
		
		
		int i=10;
		
		if(i==10)
		{
			System.out.println("The value of i is 10");
		}
		
		
		
		int j=10;
		
		if(j==20)
		{
			System.out.println("The value of j is 20");
		}
		else
		{
			System.out.println("The value of j is not 20");
		}
		
		
	   int k=20;
	   
	   if(k==30)
	   {
		   System.out.println("The value of k is 30");
	   }
	   else if(k==20)
	   {
		   System.out.println("The value of k is 20");
	   }else
	   {
		   System.out.println("The value of k is not 10 or 20");
	   }
		
		
		
		int x=10;
		int y=20;
		
		if(x==10)
		{
			if(y==20)
			{
				System.out.println("The value of x is 10 and y is 20");
			}
		}
		
		
		int a=1;
		
		while(a<=5)// entry condition
		{
			System.out.println(a);
			a++;
		}
		
		int b=1;
		do 
		{
			System.out.println(b);
			b++;
		}while(b<=5);//exit condition
		
		
		
		
         for(int c=1;c<=5;c++)
         {
        	 System.out.println(c);
         }
		
		
         
         
         //switch
         
         int month=3;
         
         switch(month)
         {
         case 1:
        	 System.out.println("Month id Jan");
         break;
         case 2:
        	 System.out.println("Month id Feb");
         break;
         
         default:
        	 System.out.println("Invalid month");
        	 break;
         
         
         }
         
         
         

	}

}
