class one
     {
         static int i=0;
          one()
             {
                  i++;
                  System.out.println(i);      
              }  
     }

class second
   {
       public static void main(String[] args)
           {
                 one obj1 = new one();
                 one obj2 = new one();
                 one obj3 = new one();
           }
    }