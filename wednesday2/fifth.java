//this keyword used in constructor
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

class fifth
    {
         public static void main(String[] args)
             {
                    one obj1 = new one(9);      
              }
     }