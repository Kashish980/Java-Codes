class worker
{
  String name;
  int eno;
 public worker(int no,String n)
  { eno=no; name=n; }
  void show()
 {
  System.out.println("Kashish Srivastava 079 \n Employee number : "+eno);
  System.out.println("Employee name : "+name);
 }
}
 class dailyworker extends worker
{
 int rate;
 public dailyworker(int no,String n,int r)
  {
   super(no,n);
   rate=r;
  }
 public void comPay(int h)
 {
 super.show();
 System.out.println("Salary : "+rate*h);
 }
}
class salariedworker extends worker
{
 int rate;
 salariedworker(int no,String n,int r)
 {
 super(no,n);
 rate=r;
 }
 int hour=40;
 void compay()
 {
 super.show();
 System.out.println("Salary : "+rate*hour);
 }
}
//--------- main -----------
class Exp5
{
public static void main(String args[])
{
dailyworker d=new dailyworker(25,"John",70);
salariedworker s=new salariedworker(20,"Donald",100);
d.comPay(45);
s.compay();
}
}