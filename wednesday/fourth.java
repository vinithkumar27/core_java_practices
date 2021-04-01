import java.util.Scanner;
class one
     {
           one()
              {
                   Scanner in = new Scanner(System.in);
                   System.out.println("find amount of  bonus for a workers");
                   System.out.println("Enter worker salary");
                   int salary = in.nextInt();
                   System.out.println("Enter the year of experiance");
                   int service = in.nextInt();
            
                         if(service >5)
                               {
                                      System.out.println("your salary is "+(salary)+"and your bonus amount is "+(.5*salary));
                               }
                         else
                                {
                                      System.out.println("you are not eligible to get a bonus in this year");
                                 }
              }
      }


class fourth
     {
          public static void main(String[]  args)
              { 
                      one obj1 = new one();
              }
     }