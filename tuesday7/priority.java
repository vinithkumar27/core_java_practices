class one extends Thread
   {
     Thread t= new Thread(this);
     Thread t1 = new Thread(this);
public void run()
            {
                 System.out.println("First thread is "+t.getPriority());
                 System.out.println("Second thread is "+t.getPriority());
                 t.setPriority(10);
                 t1.setPriority(8);
                 System.out.println("priority t-altered "+t.getPriority());
                 System.out.println("priority t1-altered "+t1.getPriority());
             }
 
    }

class priority
   {
       public static void main(String[] args)
          {
              one obj = new one();
               obj.start(); 
          }
    }