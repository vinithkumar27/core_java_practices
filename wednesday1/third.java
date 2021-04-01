class one
   {
       public void two()
           {
                for(char i='A';i<='E';i++)
                  {
                    for(char j='A';j<=i;j++)
                       {
                           System.out.print(j);
                       }System.out.println();
                   }
             }
    }


class third
   {
       public static void main(String[] args)
            {
                  one obj1 = new one();
                  obj1.two();
            }
   }