Class Parent
{
private void inherit()
{
System.out.println("Kashish 079 This cant be inherited");
}
}

Class Child extends Parent
{
public static void main(String args[])
{
inhert(); //Compile time error
}
}