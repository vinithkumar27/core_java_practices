class one implements Runnable
   {
        Thread t = new Thread(this);
       one()
          {
               System.out.println("Hi vinith");
               t.start();
           }
       public void run()
           { 
               String name="hello world";
                for(int i=0;i<=name.length();i++)
                  {
                    try
                     {
                      System.out.print(name.charAt(i));
                      t.sleep(1000);
                      }catch(Exception k){}           
                   }System.out.println();
           }
    }

class third
   {
        public static void main(String[] args)
             { 
                 one obj = new one();
                 //Thread t = Thread.currentThread();
                //  System.out.println(""+t.getName());
                  for(int j=0;j<=5;j++)
                     {
                         try 
                           {
                           System.out.println(j);
                           Thread.sleep(200);
                           }catch(Exception s){}
                     } 
             }
    }