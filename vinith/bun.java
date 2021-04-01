import java.util.Scanner;
class gun
        {
            gun()
                  {
                         Scanner in = new Scanner(System.in);
                         
                         System.out.println("Enter the values of a");
                         int a=in.nextInt();
                         System.out.println("Enter the values of b");
                         int b=in.nextInt();
                         System.out.println("Enter the values of c");
                         int c=in.nextInt();
                         double result = b*b - 4.0 *a*c;
                          
                         if(result >0)
                                 {
                                      double r1 = -b + (Math.pow(result,0.5)) / (2.0*a);
                                      double r2 = -b - (Math.pow(result,0.5)) / (2.0*a);
                                      System.out.println("The range of value is      "+r1+"  "+r2);
                                  }
                          else if(result==0.0)
                                   {
                                        double e1 = -b / (2*a);
                                        System.out.println("The value of quadric is "+e1);
                                    }
                          else 
                                   {
                                         System.out.println("The value of quadric equation is invalid");
                                   }

                                
                   }
         }
 

class bun
         {
              public static void main(String args[])
                    {
                         gun in = new gun();
 
                     }

         }