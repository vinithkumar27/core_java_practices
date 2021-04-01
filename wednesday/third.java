import java.util.Scanner;
class one
     {
          one()
              {
                  Scanner in = new Scanner(System.in);
                  System.out.println("customer purchase units");
                  System.out.println("Enter the purchase units");
                  int units = in.nextInt();                      
                        if(units*100>500)
                            {
                                  System.out.println("you are qualified for 10 percent discount of "+(0.1*units*100)+" Your total cost is "+((units*100)-(0.1*units*100)));
                             }
                         else
                             {
                                   System.out.println("Sorry you are not eligible for discount price");
                              }
                }
      }

class third
     {
          public static void main(String[] args)
              {
                  one obj1 = new one	();
               }
      }