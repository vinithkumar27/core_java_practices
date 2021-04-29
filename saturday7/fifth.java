class one extends Thread 
   {
         public void run()
           {
                 for(int i=0;i<5;i++)
                    {
                         System.out.println("child thread");
                         Thread.yield();
                     }
            }
    }

class fifth
   {
         public static void main(String[] args)
            {
                one t= new one();
                t.start();
                for(int j=0;j<5;j++)
                      {
                             System.out.println("main Thread");
                      }
            }
   }