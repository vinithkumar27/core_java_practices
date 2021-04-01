//this keyword is used to refer current class of constructor using this();
class one
    {
        one()
            {
                 System.out.println("Hi vinith");
            }
        one(int x)
            {    
                 this();
                 System.out.println("Welcome you man"); 
             }
     }

class thisconstructor
    {
         public static void main(String args[])
             {
               
                one obj2 = new one(5);
              }
     }