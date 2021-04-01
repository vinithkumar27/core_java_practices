import java.util.Scanner;
class one
    {
         one()
              {
                    Scanner in = new Scanner(System.in);
                    System.out.println("To check the year is leap year or not");
                    int year = in.nextInt();
                    if ((year%4)==0)
                        {
                             if((year%100)==0)
                                  {
                                       if((year%400)==0)
                                           {
                                                System.out.println("It is a leap year");
                                           }
                                       else
                                            {
                                                  System.out.println("It is not a leap year");
                                            }
                               else 
                                  {
                                      System.out.println("it is a leap year");
                                  }
                    else 
                       { 
                            System.out.println("it is not a leap year");
                        }
                         }
                    
                
                    
                }
      }

class fourth 
    {
           public static void main(String[] args)
             {
                one oo1 = new one();
             }
    }