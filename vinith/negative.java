import java.util.Scanner;
class positive
          {
                positive()
                      {
                           Scanner in = new Scanner(System.in);
                           System.out.println("Enter the input value");
                           int a = in.nextInt();
                       
                    if(a>0)
                        {
                             if(a<1)
                                  {
                                        System.out.println("The value is too smaller positive no");
                                   }
                             else if (a>10000)
                                   {
                                         System.out.println("The value is large positive no");
                                   } 
                              else 
                                    {
                                         System.out.println("The value is positive no");
                                     }
                            }
                     else if(a<0)
                            {
                                 if((Math.abs(a))<1)
                                         { 
                                               System.out.println("The value is too smaller negative no");
                                          }
                                  else if (Math.abs(a)>100000)
                                          {
                                              System.out.println("The value is large negative no");
                                          }
                                   else 
                                         {
                                                System.out.println("The value is negative no");
                                          }
                                   }
                       else
                             {
                                    System.out.println("The entered value is zero");
                              }
             }
    }
                          


class negative
      {
               public static void main(String args[])
                    {
                          positive obj1 = new positive();
                      }
    }