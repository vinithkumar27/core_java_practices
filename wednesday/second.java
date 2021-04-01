import java.util.Scanner;
class one
    {
         public void violet()
              { 
                 Scanner in = new Scanner(System.in);
                 System.out.println("Enter the value of a ");
                 int a = in.nextInt();
                 System.out.println("Enter the values of b");
                 int b = in.nextInt();
                 System.out.println("Enter the values of c");
                 int c = in.nextInt();
                 System.out.println("Enter the values of d");
                 int d = in.nextInt();
                      if((a<b)&&(b<c)&&(c<d))
                          { 
                                System.out.println("The value of d is high");
                          }
                      else if((a<b)&&(b<c))
                           {
                                System.out.println("The value of c is high");
                            }
                      else if(a<b)
                            {
                                 System.out.println("The value of b is high");
                             }
                      else 
                             {
                                   System.out.println("The value of a is high");
                             }
               } 
     }


class second
   {
         public static void main(String[]  args)
              {
                     one obj1 = new one();
                     obj1.violet();
               }
    }