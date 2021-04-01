import java.util.Scanner;
class one
     {
          public void run()
                 {
                       Scanner in = new Scanner(System.in);
                       System.out.println("Enter age of person1");
                       int p1 = in.nextInt();
                       System.out.println("Enter age of person2");
                       int p2 = in.nextInt();
                       System.out.println("Enter age of person3");
                       int p3=in.nextInt();
                          
                              if(p1>p2)
                                    {
                                 if(p1>p3)
                                        { 
                                              System.out.println("The person p1 age is high");
                                        }
                                    }
                              else if(p2>p1)
                                    {
                                 if(p2>p3)
                                        {
                                              System.out.println("The person p2 age is high");
                                        }
                                     }
                               else 
                                      {
                                             System.out.println("The person p3 age is high");
                                      }
                       }
        }
    

class fifth
   {
        public static void main(String[] args)
             {
                  one obj1 = new one();
                  obj1.run();
             }
   }