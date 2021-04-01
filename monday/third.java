
class one
   {  
       one()
           {
                 int a,b,c;
                   for(int a=1;a<=10;a++)
                       {
                    for(int b=1;b<=a;++b)
                        {
                             System.out.print(b);
                         }
                    for(int c=10-a;10>=1;c--) 
                           { 
                        System.out.print("*");   
                           }  
           }System.out.println("");
   }
}

class third
    {
        public static void main(String[] args)
            {
                 one obj1 = new one();
            }
    }
 