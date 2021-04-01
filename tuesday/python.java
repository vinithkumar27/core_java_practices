import java.util.Scanner;
class ramu
   {
         ramu()
              {
                 Scanner in = new Scanner (System.in);
                 System.out.println("Enter the values of a");
                 int a = in.nextInt();
                 System.out.println("Enter the values of b");
                 int b = in.nextInt();
                 if(a<=b)
                      {
                           System.out.println("Hello mr.vinith kumar");
                       }
                  else 
                      { 
                          System.out.println("The entered values are wrong");
                       }
              }
   }

class python
   {
        public static void main(String[]args)
               {
                   ramu obj1 = new ramu();
               }
    }