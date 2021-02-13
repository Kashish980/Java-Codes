//Write a program to implement the concept of threading by extending Thread Class
class Multi extends Thread{  
public void run(){  
System.out.println("Kashish Srivastava 079 \n thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();  
 }  
}  