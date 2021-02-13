interface A
{
void meth1() ;
void meth2() ;
}
class MyClass implements A
{
public void meth1()
{
System.out.println("Kashish Srivastava 079 \n This is meth1");
}
public void meth2()
{
System.out.println("Kashish Srivastava 079 \n This is meth2");
}
public static void main(String args[])
{
MyClass m = new MyClass();
m.meth1();
m.meth2();
}
}