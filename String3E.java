/*Write a Java code that converts int to Integer, converts Integer to String, converts String to int,
 converts int to String, converts String to Integer converts Integer to int.*/
 class String3E{
	public static void main(String[] args)  
    {  
	
	  System.out.println("int to Integer");
      Integer obj1 = new Integer(-76);
      System.out.println(obj1);
	  	  System.out.println("Integer to String");
    String str = obj1.toString();
    System.out.println(str);
	  	  	  System.out.println("String to int");
			  int number = Integer.valueOf(str);
        System.out.println(str + " in float is : " + number);
			  	  	  System.out.println(" int to String");
					  String fromInteger = "" + number;
					  System.out.println(fromInteger);
					  	  System.out.println("String to Integer");

int f = Integer.parseInt("200");
        System.out.println("String 200 in int is : " + f);






        
			
	
        
			System.out.println("Kashish Srivastava 079");


    }  
}
