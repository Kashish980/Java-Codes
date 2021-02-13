class Student
{ 
  int roll;
  String name;
  double marks;
  public void setData(int r,String s,double m)
  {
  roll=r;
  marks=m;
  name=s;
  }
  public void getData()
  {
  System.out.println("Kashish Srivastava : 079 \n Roll no. of the student" + roll);
  System.out.println("Name. of the student" + name);
  System.out.println("Marks. of the student" + marks);
  }
 }
class Teacher
{
int id;
String nm;
public void setInfo(int i,String e)
{
  id=i;
  nm=e;
 }
 public void getInfo()
{
  System.out.println("Roll no. of the Teacher" + id);
  System.out.println("Name. of the Teacher" + nm);
 }
}

class TestStutech
{
 public static void main(String args[])
 {
 Student S1=new Student();//object creation
 S1.setData(49,"Sam",98.0);
 S1.getData();
 System.out.println();
 Student S2=new Student();//object creation
 S2.setData(79,"Mark",97.0);
 S2.getData();
 System.out.println();
 Teacher T1=new Teacher();//object creation
 T1.setInfo(01,"Hawk");
 T1.getInfo();
 System.out.println();
 Teacher T2=new Teacher();//object creation
 T2.setInfo(03,"Helena");
 T2.getInfo();
 }
}