import java.util.Scanner;
class enter
    {
          public void one()
               {    
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter your name please   ");
                    String name = in.nextLine();
                    System.out.println("Enter your age please");
                    int age = in.nextInt();
                    
                    do
                            {
                                     System.out.printf("your selected now you are at %d  std %n ",age);
                                     age+=1;
                            }while(age<=20);
                    System.out.println("now you are graduated right now");
                   }
     }

class third 
    {
         public static void main(String[] args)
               {
                    enter r1 = new enter();
                    r1.one();
               }
    }