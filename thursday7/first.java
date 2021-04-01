class one
   {
       synchronized public void kiddo(String str)
          {
               System.out.println(str);
               display();
          } 
        public void display()
           {
               for(int i=0;i<=10;i++)
                 {
                       System.out.println(i);
                  }
            }
    }

class two extends Thread
    {
         Thread t = new Thread(this);
         one obj;    
         String msg;      
          two(one objec,String msg)
             {
                  obj=objec;
                  t.start();
                  this.msg=msg;
              }
           public void run()
              {
                      obj.kiddo(msg);
               }
     }

class first
  {
      public static void main(String[] args)
         {
                one obj = new one(); 
                two t = new two(obj,"hi");
                two t2 = new two(obj,"vinith");
                two t3 = new two(obj,"how are you");
          }
  }