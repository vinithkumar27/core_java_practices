//this keyword used in methods or functions
class one 
    {
          public void two()
              {
                  System.out.println("Hi vinith i am first method or function");
              }
           public void three()
               {
                    this.two();
                    System.out.println("Hi vinith i am the second method or function");
                    this.two();
               }     
     }
 
class fourth
    {
         public static void main(String[] args)
              {
                      one obj1 = new one();
                       obj1.three();
              }
    }