class one
   {
       public void kiddo()
              {
                  char n = 'E';
                  for(char i='A';i<=n;i++)
                     {
                        for(char j=n-1;j>=i;j--)
                          {
                              System.out.print(" ");
                          }
                            for(char k='A';k<=i;k++)
                              {
                                   System.out.print(i);
                              }System.out.println();
                      }
               }
    } 

class eigth
   {
        public static void main(String[] args)
            {
                     one obj1 = new one();
                     obj1.kiddo();
             }
    }

