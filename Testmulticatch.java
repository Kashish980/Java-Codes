public class Testmulticatch
{
	public static void main(String args[])
	{
		try{
		int a[] = new int[5];
			a[5] =50/0;
			}catch(ArithmeticException e)
			{
				System.out.println("arith excp.");
				}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index excp.");
				}
			catch(Exception e)
			{System.out.println("all excp.");}


		System.out.println("rest of the code");
	}
}