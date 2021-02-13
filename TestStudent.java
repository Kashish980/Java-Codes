class Student
{ int roll;
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
  System.out.println("Roll no. of the student " + roll);
    System.out.println("Name. of the student " + name);
	  System.out.println("Marks. of the student " + marks);
	  }
	  }
class TestStudent
{
 public static void main(String args[])
 {
 Student S1=new Student();//object creation
 S1.setData(79,"Kashish",98.0);
 S1.getData();
 System.out.println();
 }
 }