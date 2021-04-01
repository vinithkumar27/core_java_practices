class one extends Thread
    {  
       
        one()
            {
                  Thread t = new Thread(this);    
                  System.out.println(t.getName());
            }
    }

class second
   {
      public static void main(String[] arg)
         {
                Thread t1 = Thread.currentThread();
                one obj1 = new one();
                System.out.println(t1.getName());
          }
    }


