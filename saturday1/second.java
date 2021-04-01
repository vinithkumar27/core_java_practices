class one 
     {
            one()
                {
                     System.out.println("hi vinith");
                     System.out.println("welcome you man");                    
                } 
            one(int x)
                 {
                        System.out.println("int paramtered constructor");
                 }
            one(float y)
                  {
                          System.out.println("Float parametered constructor");                   
                   }
            one(String name)

      }

class second
    {
         public static void main(String args[])
            {
                   one obj1 = new one();
            }
     }


the current class name same as constructor name
automatically called during the creation of object
constructor does not return anything
we create a extra constructor by different parametes value