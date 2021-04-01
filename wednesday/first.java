class one
    {
           one()
               {
                   System.out.println("This one is constructor");
               }
           public void kiddo()
                {
                     System.out.println("This one is method");
                }
     }


class first
    {
        public static void main(String[]  args)
                 {
                       one obj1 = new one();
                       one obj2 = new one();
                       obj2.kiddo(); 
                      // new one().kiddo();
                  }
     } 