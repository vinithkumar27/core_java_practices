//this keyword in construcor
class one
    {
        one()
            {
                  System.out.println("Hi vinith ");         
             }
        one(float x)
             {
                 this();
                 System.out.println("Welcome to our IT world");
              } 
        one(int y)
              {
                  this();
                  System.out.println("you are good right now");
              }
     }
// in constructor we use this for to avoid create more objects.
class third
    {
         public static void main(String args[])
             {
                    one obj1 = new one(12); 
                    one obj2 = new one(12.2f);                 
             }
     }