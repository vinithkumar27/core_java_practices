class one
    {
         one()
             {
                int n=5;
                int stars = 0;
                for(int i=0;i<n;i++) 
                  {
                    for(int j=n-1;j>=i;j--)
                       {
                           System.out.print(" "); 
                       }
                         for(int k=0;k<=stars;k++)
                           {
                                System.out.print("*");
                            }
                  stars +=2;
                  System.out.println();
                     }
                  }
     }

class fourth
    {
        public static void main(String args[])
            {
                   one obj1 = new one();               
             }  
    }