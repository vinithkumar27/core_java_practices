class one implements Runnable
   {
      Thread t = new Thread(this);
         one()
            {
                System.out.println(t.isAlive());
                t.start();
            }
  
         public void run()
             {
                  for(int i=0;i<=5;i++)
                     {
                         System.out.println("hello world");
                      try
                         {
                          t.sleep(1000);
                         }catch(Exception w){}
                       next();
                     }
              }
        public void next()
           {
                System.out.println("hi vinith");
                System.out.println(t.isAlive());
             }
    }

class second
   {
       public static void main(String[] args)
          {
                one t = new one();
           }
   }
