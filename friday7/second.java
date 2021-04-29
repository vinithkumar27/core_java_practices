class one
   {
         synchronized public void rohit(String name)
            {
                 System.out.println("["+name);
                try
                  {
                 Thread.sleep(500);
                  }catch(Exception w){}
                 System.out.println("]");
                 display();
            }
          public void display()
               {
                    for(int i=0;i<=4;i++)
                       {
                            System.out.print("  "+i);
                        }System.out.println();
               }
    }

class two extends Thread 
   {
         one obj;
         Thread t = new Thread(this);
          String srg;
         two(one object,String srg)
             {
                  obj=object;
                  t.start();
                  this.srg=srg;
              }
  
          public void run()
               {
                    obj.rohit(srg);
                }   
    }

class second
   {
        public static void main(String[] args)
           {
                 one t = new one();
                 two obj1 = new two(t,"hello");
                 two obj2 = new two(t,"vinith");
                 two obj3 = new two(t,"welcome to mars");
           }
    }