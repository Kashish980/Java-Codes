//method arguments and datatypes-method overloading-argument data types r dffrnt
//method signature(in *)--int *sum(int a)*,double *sum(int a)*
class Over
{
 public static void main(int a)
 {
  System.out.println("1");
  }
   public static void main(float a)
 {
  System.out.println("2");
  }
  public static void main(String args[])
  {
	  Over s=new Over();
	  s.main(3);
	  s.main(8.0f);
	  //s.main("hello");
	  	  s.main('h');

  }
 }