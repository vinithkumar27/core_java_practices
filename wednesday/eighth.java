import java.util.Scanner;
class one
   {
        public void red()
             {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter the alphabet to find up or lower case");
                    char alpha = in.next().charAt(0);
                        if((alpha >= 'A')&&(alpha<='Z'))
                            {
                                   System.out.println("The entered value is in upper case of "+alpha);
                             }
                        else if((alpha >='a')&&(alpha<='z'))
                              {
                                    System.out.println("The entered values is in lower case of "+alpha);
                               }
                         else
                               {
                                     System.out.println("The value is unformatted alphabet");
                                }

             }    
     }



class eighth
     {
           public static void main(String[] args)
              {
                     one obj1 = new one();
                     obj1.red();
              }
     }
