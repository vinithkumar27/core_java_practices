//method overloading
class one
    {
        public void two()
            {
                   System.out.println("I am first one");
            }
     }

class red extends one
      {
           public void two(int x)
                {
                      System.out.println("I am second one");    
                }
       }

class third
   {
        public static void main(String[] args)
           {
                  red obj1 = new red();
                  obj1.two(9);
           }
   }