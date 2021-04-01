import java.util.Scanner;
class one
   {
        public void gun()
            {
                  //to set input as 1 output as 1
                  //to set input as -1 output as 1
                      Scanner in = new Scanner(System.in);
                      System.out.println("To enter the value of set");
                      int set = in.nextInt();
                        
                              if(set<0)
                                  {
                                      System.out.println("The actual values are   output: "+(-1*set));
                                  }
                              else 
                                   {
                                      System.out.println("The actual values are   output:  "+set);
                                  }
              }
     }


class sixth
      {
           public static void main(String[] args)
                {
                      one obj1 = new one();
                      obj1.gun();
                }
      }
     
 
