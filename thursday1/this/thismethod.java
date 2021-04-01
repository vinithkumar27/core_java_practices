//this keyword to refer current class method.
class one
    {
         public void two()
             {
                   System.out.println("Hello vinith");
              }
         public void three()
             {
                   two();
                   System.out.println("Welcome to you");
                    
             } 
     }

class thismethod
    {
        public static void main(String args[])
             {
                  one obj1 = new one();
                  obj1.three();
             }
    } 