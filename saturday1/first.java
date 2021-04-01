class one
   {
       
       one()
          {
               
              System.out.println("how are you man"); 
          }
      public void two()
          {
              System.out.println("hi");
               System.out.println("welcome");
           }
     public void three()
           {
             
                this.two();
                System.out.println("you are good right now");
                System.out.println("wear your mask please");
           }
       
   }

class first
   {
        public static void main(String args[])
            {
                  one obj1 = new one();     
                  obj1.two();        
                   one obj2 = new one();
                   obj2.three();
             }
    }