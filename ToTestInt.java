import java.util.*;
interface test
{
int square(int x);
}
class arithmetic implements test 
{
public int square(int x)
{
int z = x*x;
return z ;
}
}
class ToTestInt
{
public static void main(String args[])
{
arithmetic a = new arithmetic();
int e = a.square(4);
System.out.println(e);
System.out.print("Kashish Srivastava 079");
}
}