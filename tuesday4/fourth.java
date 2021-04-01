class one
     {
           public void two()
               {
                      System.out.println("Hi i am base class");
                }
      }
 
class red extends one
      {
             public void two()
                  {
                        System.out.println("Hi iam derived class");
                  }
      }

class fourth 
    {
         public static void main(String[] args)
            {
                   /*one ref;
                   one obj1 = new one();
                   red obj2 = new red();
                  
                   ref=obj1;
                   ref.two(5);*/
                   one obj1 = new one();
                   obj1.two();
            }
     }