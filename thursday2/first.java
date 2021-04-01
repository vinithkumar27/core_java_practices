class one
    {
        int z;
         public void rohit(int a,int b)
            {
                  z = a+b;
                  System.out.println("The addition of two numbers "+z);              
             }
         public void gill(int a,int b)
             {  
                  z = a-b;
                   System.out.println("The subtraction of two numbers "+z);
              }
    }

class two extends one
     {
          public void pujara(int a,int b) 
               {
                     z = a*b;
                     System.out.println("The multiplication of two numberss "+z);       
               }
           public void kholi(int a,int b)
               {
                     z = a/b;
                     System.out.println("The division of two numbers "+z);
               }
       }

class first
    {
         public static void main(String[] args)
             {
                  two obj1 = new two();
                  obj1.rohit(10,10);
                  obj1.gill(22,2);
                  obj1.pujara(10,2);
                  obj1.kholi(40,2);                      
              }
     }