class one 
    {
          one()
               {
                      System.out.println("hi vinith ");
               } 
          one(int x)
              {
                    this();
                     System.out.println("hi giri");
               }
         one(float y)
               {
                     this(5);
                     System.out.println("hi vino");         
               }
    }


class third
    {
         public static void main(String[] args)
            {
                    one obj1 = new one(12.5f); 
             }
     }