class Bikeme{
final void run()
{
System.out.println("100kmph");
 }
}
class Honda extends Bikeme{
  void run()
 {
  System.out.println("10000kmph");
 }
 public static void main(String args[])
 {
  Honda obj=new Honda();
  obj.run();
  }
  }
  //final method overidden