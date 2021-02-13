/*Write a Java code that converts float to Float converts Float to String converts String to float 
converts float to String converts String to Float converts Float to float.*/
import java.lang.*;
class String4E{
	public static void main(String[] args)  
    {  
	
      float myFloat = 24.22f;
	  System.out.println("float to Float");
      Float obj1 = new Float(myFloat);
      System.out.println(obj1);
	  	  System.out.println("Float to String");
    String str = obj1.toString();
    System.out.println(str);
	  	  	  System.out.println("String to float");
			  float number = Float.valueOf(str);
        System.out.println(str + " in float is : " + number);
			  	  	  System.out.println(" float to String");
					  String fromFloat = "" + number;
					  System.out.println(fromFloat);
					  	  System.out.println("String to Float");

float f = Float.parseFloat("200");
        System.out.println("String 200 in float is : " + f);





        
			System.out.println("Kashish Srivastava 079");


    }  
}
