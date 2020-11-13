import java.util.Scanner;
class Rectangle 
{
 int l,b,area;
 public void insertData()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter length");
  l=s.nextInt();
  System.out.println("enter breadth");
  b=s.nextInt();
  }
  public void printData()
  {
   area=l*b;
   System.out.println("Area is: " + area);
   }
  }
  class TestRectangle
  {
  public static void main(String args[])
  {
   Rectangle r= new Rectangle();
   r.insertData();
   r.printData();
   }
   }