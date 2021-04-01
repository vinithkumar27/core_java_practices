import java.util.Scanner;
class one
     {
           public void entry()
                { 
                  Scanner in = new Scanner(System.in);
                  System.out.println("no. of working days in college");
                  int total = in.nextInt();
                  System.out.println("no of class you attended by you");
                   int attend = in.nextInt();
  
                  int percentage = (attend*100)/total ;
                      if(percentage>75)
                           {
                                  System.out.println("You are allowed right now");
                           }
                      else
                            {
                                  System.out.println("you are not allowed for exam");        
                             }
                  }
      }

class seventh
     {
          public static void main(String[]  args)
             {
                       one obj1 = new one();
                       obj1.entry();
             }
     }
  
  
