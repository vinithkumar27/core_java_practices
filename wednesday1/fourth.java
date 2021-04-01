class one 
   {
        public void two()
           {
                for(char i='E';i>='A';i--)
                   {
                     for(char j='A';j<=i;j++)
                       {
                          System.out.print(j);
                       }System.out.println();
                    }
           }
   }


class fourth
   {
       public static void main(String[] args)
            {
                  one obj1 = new one();
                  obj1.two();
            }
   }