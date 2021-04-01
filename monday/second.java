class one
    {
        one()
          {
               int lines = 10;
               for(int i=1;i<=lines;i++)
                    {
                          for(int j=1;j<=i;j++)
                              {
                                  System.out.print((i*j)+" ");
                               }System.out.println(""); 
                     }
           }
    }

class second
    {
        public static void main(String[] args)  //main method
             {
                 one obj1 = new one();    
             }
    }