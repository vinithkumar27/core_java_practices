//method overloading
class one
    {
          public void two()
               {
                    System.out.println("Hi am 1st person");
               }
           public void two(int a)
               { 
                    System.out.println("Hi am 2nd person");
                }
           public void two(String name)
                {
                    System.out.println("Hi am 3rd person");
                }
     }

class second
    {
          public static void main(String[] args)
              {
                   one obj1  = new one();
                   obj1.two("Kiddo");      
              }
     }