/*Write Java program using the following string methods:
•	int hashCode()
•	String trim()
•	String intern()
•	int length()
•	String replace(char oldChar, char newChar)
•	String substring(int beginIndex, int endIndex)*/
class String2E{
	public static void main(String[] args)  
    {  
        
        String s1= "Kashish";  
        System.out.println("Hash code Value for object is: " + s1.hashCode());  
		        System.out.println("Trim value is : " + s1.hashCode());  
			String	s = " Kashish loves reading Novels ";  
    System.out.println(s.trim());
	String s2 = s.intern();
			        System.out.println("Intern function : " + s2);  
							        System.out.println("Length value is : " + s1.length());  
String originalString = "Kashish Srivasyava ";
         
        String newString = originalString.replace('a', 'A');    
         System.out.println("Original and new value is:");
        System.out.println(originalString);
        System.out.println(newString);
		System.out.println("substring function");
		System.out.println(s1.substring(3));  
         
        System.out.println("Hello ".substring(6)); 
			System.out.println("Kashish Srivastava 079");


    }  
}
