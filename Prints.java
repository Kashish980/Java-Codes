interface print
{
  void run();
    Print();

 }
 class Prints implements print
 {
 public void run()
 {
	 //Super();
  System.out.println("cls step");
      //Print();

 }
 public static void main(String args[])
 {
  print obj =  new Prints();
  obj.run();
  }
  }
  
  
  //running constructor as in interface
  //in overidding try to change the return data type nd does it work