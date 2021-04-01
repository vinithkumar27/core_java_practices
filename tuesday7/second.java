class one extends Thread
   {
     public void run()
                         {
                           try
                            {
                            Thread t = new Thread(this);
                            System.out.print("1234567890");
                            System.out.println("check if the thread is alive or not "+t.isAlive());
                            Thread.sleep(1000);
                             System.out.println("check if the thread is alive or not "+t.isAlive());
                               }catch(Exception n){}
                          }
    }

class second
   {
        public static void main(String[] args)
            {
                  one obj = new one();
                  obj.start();
            }
    }