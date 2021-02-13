//class12
//CONSTRUCTOR 
//constructer-obj bnte hi kare!automatically calls when instance, no data type , 
//new-dynamic memory allocation
//Default constructor and parameterised  constructer
//Return type lagate h constructor m toh method m convert ho jata h
//Default constructer--
//NO PARAMETERS obj bnte hi constructer call ho jata h

//class13
//inheritance-acquire the properties from parent class to another class
//syntax- class child class extends(keyword) parent(super) class
class Employee
{
 float sal=40000;
 }
 class Programmer extends Employee //inheritance 
 {
  int bonus=10000;
  public static void main(String args[])
  {
  Programmer p=new Programmer();
  System.out.println("salary" + p.sal );
    System.out.println("bonus" + p.bonus );
	}
 }
	//java does not support multiple inheritance due to ambiguity but can be acheived through interfaces
	//types - single+multilevel+hieracheal

 