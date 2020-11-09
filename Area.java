import java.util.*;
import java.lang.*; //default package
class 	Area
{
   public static void main(String args[])
   {
   Scanner s=new Scanner(System.in);
   double rar,cir,a;
    System.out.println("Enter radius no.");
	rar=s.nextDouble();
	a=Math.PI*Math.pow(rar,2);
	cir=2*Math.PI*rar;
	System.out.println("Area is:" + a);
		System.out.println("Circumference is:" + cir);

	}
}