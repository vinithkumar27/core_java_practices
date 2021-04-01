//create Thread by extends Thread
class one extends Thread 
   {
      Thread t = new Thread(this);
       one()
           {
               t.start();       
           }
        public void run()
           {
                for(int i=0;i<5;i++)
                 {
                     try
                      {
                     System.out.println(" "+t.getName()); 
                     t.sleep(100);
                      }catch(Exception u){} 
                  }  
            }
    }

class second
   {
        public static void main(String[] args)
            {
                 String name="vinith kumar s";
                  one obj = new one();    
                  for(int j=0;j<=4;j++)
                     {
                         try
                           {
                               System.out.println("Hi vinith welcome no.."+j); 
                               Thread.sleep(200);
                           }catch(Exception h){}
                      }         
                  for(int k=0;k<=name.length();k++)
                      {
                         try
                           {
                            System.out.print(""+name.charAt(k));
                            Thread.sleep(100);
                           }catch(Exception e){}
                       }System.out.println();
             }
    }