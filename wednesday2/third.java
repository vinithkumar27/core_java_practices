//this keyword used in constructors
class one
    {
          one()
              {
                    System.out.println("Hi vinith i am first constructor");        
              }
          one(int x)
              {
                     this();
                     System.out.println("Hi vinith i am second constructor");
              }
}
class third 
     {
          public static void main(String[] args)
               {
                      one obj1 = new one(9 );
 
               }
      }