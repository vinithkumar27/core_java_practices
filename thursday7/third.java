class one extends Thread
   {
       Thread t;
       String name;
     synchronized public void one(String str) 
          {
                name = str;
                t = new Thread(this,str);
                System.out.println(" "+t.getName());
                t.start();
          }
       
       public void run()
          {
               for(int i=0;i<=10;i++)
                 {
                       System.out.println(i);
                 }
          } 
    }

class third
   {
        public static void main(String[] args)
           {
                  one obj = new one();
                  obj.one("vinith");
                  one obj1 = new one("preethip");
                  one obj2 = new one("goku");
           }
    }