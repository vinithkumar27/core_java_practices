class sample extends Thread
 {
   Thread t=new Thread(this);
   sample()
        {
             t.start();
         }
    public void run()
         {
          for(int i=0;i<10;i++)
	{
	   try{
	            System.out.println(""+i);
	             t.sleep(200);
	         }catch(Exception dd){}
	  }
            }
 }


class third
 { 
   public static void main(String asd[])
       {
           sample obj=new sample();
            for(int i=0;i<10;i++)
	{
	try{
	       System.out.println("main thread"+i);
	       Thread.sleep(1000);	
	     }catch(Exception d){}
                 	}		
           }
 }