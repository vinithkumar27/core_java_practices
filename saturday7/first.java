//check priority of main Thread and child Thread

class one extends Thread
   {
         synchronized public void run()
            {
                   for(int i=0;i<=10;i++)
                     {
                         System.out.println("child Thread");
                      }
            }
    }

class first
   { 
       public static void main(String[] args)
          {
                one t = new one();
                t.setPriority(4);
                t.start();
              
               for(int j=0;j<=10;j++)
                   {
                        System.out.println("main Thread");
                   }
          }
    }