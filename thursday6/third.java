class one extends Thread
   {
    Thread t =new Thread(this);
     one()
       {
        for(int i=0;i<=6;i++)
            {
                 for(int j=0;j<=i;j++)
                   {
                    try
                      {
                       System.out.print("*");
                       t.sleep(100);
                       }catch(Exception u){}
                    }System.out.println();
              }
           }
    }

class third
   {
       public static void main(String[] args)
           {
                   one obj = new one();       
            }
    }
