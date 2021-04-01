//SUPER()   KEYWORD
//THIS()       KEYWORD
//SUPER() - super keyword is used to call the base class constructor.
//THIS() - this keyword is used to call the current class constructor.

class one
    { 
         one()
             {
                  System.out.println("Hi iam from base class constructor");
              }
     }
class two extends one
    {
         two()
             {
                    System.out.println("Hi iam immediate derived constructor");
              }
         two(int a)
              {
                     
                     System.out.println("Hi iam integer derived constructor");
               }
     }
class three extends two
      {
           three()
                {
                      super();
                      System.out.println("Hi iam derived constructor");
                 }
       }
            
class sixth
    { 
          public static void main(String[] args)
              {
                   three obj1 = new three();          
              }
     }