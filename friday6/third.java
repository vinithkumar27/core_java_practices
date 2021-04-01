class one
   {
        one()
          {
                 System.out.println("i am constructor");
           }
        
   }
 class two extends one
     {
           public void two()
          {
                 System.out.println("i a method");
           }
        static
          {
                System.out.println("i am static block");
          }
        {
              System.out.println("i am default block");
        }
      }
class third
   {
       public static void main(String[] args)
           {
                two obj=new two();
                two obj1 = new two();
                obj.two();            
           }
    }