class one extends Thread
   {
      Thread t = new Thread(this);
      public void one(String arg)
          {
                 System.out.println(arg);
                 t.start();
          } 

         public void run() 
              {
                      for(int i=0;i<=10;i++)
                        {
                              System.out.println(i);
                          }
                }
    }

class second 
   {
       public static void main(String[] args)
          {
               one t = new one();
               t.one("hi");
               one t2 = new one();
               t.one("vinith");
               one t3 = new one(); 
                t.one("how are you");
 
          }
   }