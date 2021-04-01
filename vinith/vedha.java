import java.util.Scanner;
class vikram
         {
               vikram()
                    {
                    Scanner in = new Scanner(System.in);
                    System.out.println("To find the entered value is positive or negative");
                    System.out.println("Enter the input value");
                    int a=in.nextInt();
                         
                           if(a>0)
                                   {
                                    System.out.println("The entered value is postive value");
                                    }
                           else
                                     {
                                     System.out.println("The entered value is negative");
                                      }
                       }

        }
 

class vedha 
           {
                 public static void main(String args[])
                        {
                             vikram v1 = new vikram();
                        }
            }