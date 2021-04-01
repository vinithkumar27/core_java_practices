import java.util.Scanner;
class one
   {
        int persons = 1;
        one()
           {
                 do
                     {
                          Scanner in = new Scanner(System.in);
                          System.out.printf("%n Enter your name please");
                          String name = in.nextLine();
                          System.out.printf("Hello %s",name);
                          persons+=1;
                     }while(persons<=10);          
           }
   }


class first
   {
        public static void main(String[] args)
             {
                  one obj1 = new one();       
             }
   }