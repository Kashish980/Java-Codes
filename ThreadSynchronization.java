    //example of java synchronized method  
    class Value
	{  
     synchronized void printT(int n)
	 {//synchronized method  
       for(int i=1;i<=5;i++)
	   {  
         System.out.println(n*i);  
         try{  
          Thread.sleep(400);  
         }
		 catch(Exception e)
		 {System.out.println(e);
		 }  
       }  
      
     }  
	}  
    class Thd1 extends Thread{  
    Value t;  
    Thd1(Value t){  
    this.t=t;  
    }  
    public void run(){  
    t.printT(5);  
    }  
      
    }  
    class Thd2 extends Thread{  
    Value t;  
    Thd2(Value t){  
    this.t=t;  
    }  
    public void run(){  
    t.printT(100);  
    }  
    }  
      
    class ThreadSynchronization{  
    public static void main(String args[]){  
    Value obj = new Value(); 
    Thd1 t1=new Thd1(obj);  
    Thd2 t2=new Thd2(obj);  
    t1.start();  
    t2.start();  
	System.out.println("Kashish Srivastava 079");
    }  
    }  