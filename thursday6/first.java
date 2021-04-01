class one
   {
         one()
            {
                System.out.println("Giri");
            }  
    }

class two extends one implements Runnable
      {
          Thread name = new Thread(this);
          two()
             {
                  System.out.println("The two method of thread is "+name.getName());
              }
          public void run()
              {
                    System.out.println("The run method is successfully created");
               } 
        }


/* class three extends two implements Runnable
      {
            Thread name = new Thread(this);
            three() 
                {
                      System.out.println("The three method of thread is "+name.getName());
                 }
            public void run()
                 {
                      System.out.println("I am runnable of run of three");
                }
       }  */
class first
   {
        public static void main(String[] args)
            {
                 Thread t=Thread.currentThread();
                 two obj = new two();
                  obj.run();
              /*   three obj1 = new three();
                  obj1.run();*/
                 System.out.println("The static method of "+t.getName());
            }
    }