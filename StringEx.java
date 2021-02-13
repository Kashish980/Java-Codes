//java program to create a Single object. Initialize this object eith your name.
//Find the length of your name using the appropriate String method. Find whether the charachter "a" is in your name or not; 
//if yes then find number of times 'a' appears in your name and also print the location of 'a'.
class StringEx
{
public static void main(String args[])
{
	int count=0,i,loc=0;
	String s = new String("Vishal");
	int len = s.length();
	System.out.println("length of String entered is " + len );
	for(i=0;i<len;i++)
	{
		if(s.charAt(i)=='a')
		{
			count++;
			loc=i;
		}
	
	}
		System.out.println("No of 'a' in String is " + count + " \n Location of the a is " + loc );
}
}

	