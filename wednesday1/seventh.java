class one
   {
        public void two()
             { 
                int n = 5;
                for(int i=1;i<=n;i++)
                   {
                     for(int j=n-1;j>=i;j--)
                        {
                           System.out.print(" ");
                        }
                          for(int k =1;k<=i;k++)
                            {
                                System.out.print(k);
                            }
                                System.out.println();
                     }
              }
   } 

class seventh
    {
         public static void main(String[] args)
             {
                  one obj1 = new one(); 
                  obj1.two();
             } 
     } 