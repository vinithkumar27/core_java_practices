class one    //sub class
    {  
       one()
            {
                for(int i=0;i<=5;i++)
                   {
                 for(int j=0;j<=i;j++)
                    {
                         System.out.print("*");
                    }System.out.println();
                   }
            }
    }

class fifth    //main class
    {
         public static void main(String[] args)   //main method
               {
                      one obj1 = new one();
                }
     }