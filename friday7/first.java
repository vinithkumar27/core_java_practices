class two
   {
         synchronized public void call(String val)
              {
                   System.out.println("[");
                  try
                    {
                   System.out.println(val);
                   Thread.sleep(1000);
                    }catch(Exception k){}
                   System.out.println("]");
               }
    }

class one extends Thread
   { 
       Thread t=new Thread(this);
       two kit;
       String str;
        one(two kitkat,String str)
          {
             kit=kitkat;
             this.str=str;   
              t.start();
          }
     
         public void run()
             {
                   kit.call(str);
             }
    }

class first
   {
        public static void main(String[] args) throws Exception
           {
                  two t = new two();
                  one obj = new one(t,"hi");
                  one obj1 = new one(t,"vinith");
                  one obj2 = new one(t,"how are you");
 
                   System.out.println("check it is alive or not "+obj.t.isAlive());
                   System.out.println("check it is alive or not of "+obj1.t.isAlive());
                   System.out.println("check it is alive or not of "+obj2.t.isAlive()); 
 
                   obj.t.join();
                   obj1.t.join();
                   obj2.t.join();
            
                   System.out.println("check it is alive or not after join process "+obj.t.isAlive());
                   System.out.println("check it is alive or not after join process "+obj1.t.isAlive());
                   System.out.println("check it is alive or not after join process "+obj2.t.isAlive());
            } 
    }