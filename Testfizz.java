class FizzBuzz
{
	void print()
	{
	int i;
	for(i=1;i<=15;i++)
	{
		 if(i%3==0 & i%5==0)
		{
			System.out.println("FizzBuzz");
		}
		else if(i%5==0)
		{
			System.out.println("Buzz");
		}
		else if (i%3==0)
		{
			System.out.println("Fizz");
		}	
		else
		{
			System.out.println(i);
		}
			
	}
	}
	
}
class Testfizz
{
public static void main(String[] args)
	{
		FizzBuzz o = new FizzBuzz();
		o.print();
	}
}
		