import java.util.Scanner;
class blue
         {
                 public int caller()
                       {
                           Scanner in = new Scanner(System.in);
                           int a = in.nextInt();
                           System.out.println("Enter the a value:"+a);
                           Scanner inn = new Scanner(System.in);
                           int b = inn.nextInt();
                           System.out.println("Ener the b value:"+b);
                           int c = a+b;
                           System.out.println("The c value is "+c);
                        }
          }


class red
     {
            public static void main (String [] args)
                   {
                        blue obj = new blue();
                        System.out.println(obj.caller());
                    }
      }