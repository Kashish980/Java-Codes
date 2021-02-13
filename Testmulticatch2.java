public class Testmulticatch2
{
	public static void main(String args[])
	{
		try{
		int a[] = new int[5];
			a[5] =50/0;
			}
			
			catch(Exception e)
			{System.out.println("all excp.");}
catch(ArithmeticException e)
			{
				System.out.println("arith excp.");
				}
				catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index excp.");
				}

		System.out.println("rest of the code");
	}
}
//compile time error as super class is declared first then the sub classes are declared.
//we follow as 