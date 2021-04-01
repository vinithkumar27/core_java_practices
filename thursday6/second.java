class one extends Thread
    {
      Thread t=new Thread(this);
       one()
           {
        System.out.println("i am from non static "+t.getName());
            }   
 }

class second
   {
        public static void main(String[] args)
           {
               Thread t =Thread.currentThread();
                one obj = new one();
                 System.out.println("i am from static "+t.getName());	
           }
    }