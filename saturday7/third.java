class one extends Thread
   {
        Thread t = new Thread(this);
         public void run()
           {
                System.out.print("[ ");
                for(int i=0;i<5;i++) 
                  {
                         System.out.print(i);
                         try
                           {
                                t.sleep(500);
                           }catch(Exception w){}
                   }
                System.out.println(" ]");
                System.out.println();	
          disk();
            }
        public void disk()
           {
                 System.out.println("disk is full");
           }
 
    }

class third
  {
       public static void main(String[] args)
          {
                 one t = new one();
                 one t1 = new one();
                 one t2 = new one();
                 t.start();  
                 System.out.println("check it is alive or not "+t.isAlive());
                      try{
                       t.join();
                      }catch(Exception y){}
                  System.out.println("check it is alive or not "+t.isAlive());
                 t1.start();
                  System.out.println("check it is alive or not "+t1.isAlive());
               try{
                 t1.join();
                    }catch(Exception q){}
                   System.out.println("check it is alive or not "+t1.isAlive());
                 t2.start();  
                    System.out.println("check it is alive or not "+t2.isAlive());
                   try{                 
                   t2.join();
                      }catch(Exception i){}
                   System.out.println("check it is alive or not "+t2.isAlive());
           }
   }