import java.util.*; //this is a code
class NameAgeExc
{
	public static void main(String args[])
	{
		int i,age2[]=new int[5],name2[]=new int[5];
		String age[]=new String[5],name[]=new String[5];
		System.out.println("Enter the name and age ");
		for(i=0;i<5;i++)
		{
			Scanner s=new Scanner(System.in);
			name[i]=s.next();
			age[i]=s.next();
		}
		try
		{
			for(i=0;i<5;i++)
			{
				name2[i]=Integer.parseInt(name[i]);
				if( name2[i]>= -2147483648 && 			
					name2[i]<= 2147483647)
					throw new Exception("Name should not numeric");
			}
		}
		catch(Exception e)
		{
			System.out.println("java.lang.Exception: Name is numeric");
		}
		try
		{
			for(i=0;i<5;i++)
			{
				age2[i]=Integer.parseInt(age[i]);
				if(age2[i]>50)
					throw new Exception("Age should not greater than 50");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}