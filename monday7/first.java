class one extends Thread
   {
       Thread t = new Thread(this);
         one()
           {
             t.start();
            }
         public void run()
            {
                for(int i =0;i<=10;i++)
                  { 
                    try
                     {
                      System.out.println(i);
                      t.sleep(500);
                     }catch(Exception k){}
                  }
             }
    }

class second
   {
       public static void main(String[] args)
           {
                one obj = new one();
                 for(int j=0;j<=10;j++)
                     {
                        try
                          {
                          System.out.println("Count Down Starts in "+j);
                          Thread.sleep(1000);
                          }catch(Exception n){}
                      }              
           }
    }