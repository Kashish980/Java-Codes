import java.util.Scanner;
class Account
{
 long acc,amt,bal=0,dep,wid;
 String n;
 public void insertData()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter Account_no");
  acc=s.nextLong();
  System.out.println("enter Name");
  n=s.nextLine();
  System.out.println("enter Amount");
  amt=s.nextLong();
  }
  public void printData()
  {
   System.out.println("Account no is: " + acc);
   System.out.println("Name is: " + n);
   bal=bal+amt;
   System.out.println(" Balance is: " + bal);
   }
   public void amtDep()
 {
	 Scanner s=new Scanner(System.in);
  System.out.println("enter Amount to be deposited");
  dep=s.nextLong();
  System.out.println(dep + " deposited!");
  }
    public void amtWid()
 {
	 Scanner s=new Scanner(System.in);
  System.out.println("enter Amount to be withdraw");
  wid=s.nextLong();
  System.out.println(wid + " withdrawn!");
   
  }
   public void amtDis()
 {
  bal=bal+dep-wid;
  System.out.println("balance :" + bal);
   
  }
  }
  class TestAccountDetail
  {
  public static void main(String args[])
  {
   Account r= new Account();
   r.insertData();
   r.printData();
   r.amtDep();
   r.amtWid();
   r.amtDis();
   }
   }