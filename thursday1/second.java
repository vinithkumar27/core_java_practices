class one
    {
        one()
             {
                     for(int i=5;i>=0;i--)
                     {
                           for(int k=0;k<=i;k++)
                               { 
                                  System.out.print((char)+(i+65));
                               }
                                 System.out.println();
                          } 
              }
     }

class second
    {
         public static void main(String[] args)
             {
                   one obj1 = new one();       
             }
     } 