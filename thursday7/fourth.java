class sample extends Thread
 {
   Thread t;
   String name;
   sample(String str)
	{
	   name=str;
	   t=new Thread(this,str);
	   System.out.println(""+t.getName());
	   t.start();		
	}

   public void run()
	{
	   for(int i=0;i<10;i++)
		{
	          System.out.println(""+i);
		}
	}
  }

class demolive
 {
   public static void main(String asd[]) throws Exception
	{
	   sample obj1=new sample("Vinith");
	   sample obj2=new sample("Giri");
	   sample obj3=new sample("Gopi");

	   System.out.println("Thread one is alive"+obj1.t.isAlive());
	   System.out.println("Thread one is alive"+obj2.t.isAlive());
	   System.out.println("Thread one is alive"+obj3.t.isAlive());
		
		System.out.println("Waiting for thread to finish");
		obj1.t.join();	
		obj2.t.join();	
		obj3.t.join();	

	   System.out.println("Thread one is alive"+obj1.t.isAlive());
	   System.out.println("Thread one is alive"+obj2.t.isAlive());
	   System.out.println("Thread one is alive"+obj3.t.isAlive());

	}
 }