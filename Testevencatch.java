//even no check handling
import java.util.*;
public class Testevencatch
{
	public static void main(String args[])
	{
	    Scanner s = new scanner(system.in);
		int a = s.nextInt();
		try{
		      if(a%2!=0)
			  
			}catch(Exception e)
			{System.out.println("all excp.");}

/*catch(ArithmeticException e)
			{
				System.out.println("arith excp.");
				}
			/*catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index excp.");
				}*/
		System.out.println("Data is successfully entered");
	}
}

//enter the no,use n%2==0 then throw at else statement