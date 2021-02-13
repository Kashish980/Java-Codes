class Poly
{
void sub(int a,int b)
{
System.out.println(a-b);
}
void sub(double a,double b)
{
System.out.println(a-b);
}
public static void main(String args[])
{
Poly obj=new Poly();
obj.sub(15.5,10.5);
obj.sub(70,20);
}
}