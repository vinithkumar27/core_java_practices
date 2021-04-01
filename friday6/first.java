class one extends Thread
   {
        one()
           {
               Thread t = new Thread(this);
                System.out.println(getName());
                 for(int i=0;i<=10;i++)
                     {
                         for(int j=10;j>=i;j--)
                          {
                           try
                             {
                              System.out.print("*");
                               t.sleep(100);
                              }catch(Exception l){}
                           }System.out.println();
                       }
              }
     }

class first
   {
        public static void main(String[] args)
          {
               one obj = new one(); 
          }
   }