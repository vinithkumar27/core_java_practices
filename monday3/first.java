//monday3 first
import java.util.Scanner;
abstract class bosstask
   {
          abstract public void task1();
          abstract public void task2(String name);
          abstract public void task3(int no);
   }

class worker extends bosstask
    {
            public void task1()
               {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Check the sugarcane for a preparation");
                    System.out.println("The types of sugar canes are black,red,green ");
                    System.out.println("find the type of sugarcane by weight of one bundle ");
                    System.out.println("enter the weight of the bundle");
                    int weight = in.nextInt(); 
                    if((weight>=20)&&(weight<=24))
                         {
                               System.out.println("The sugarcane is the red-sugarcane");
                          }
                     else if((weight>=25)&&(weight<=40))
                          { 
                               System.out.println("The sugarcane is the green-sugarcane");
                           } 
                      else if (weight >40 && weight <55)
                            {
                                 System.out.println("The sugarcane is the black-sugarcane");
                             }
                       else    
                             {
                                   System.out.println("The sugarcane is not qualified for processing");
                             }    
                }
          public void task2(String name)
                 {
                        for(int i=0;i<=5;i++)
                            {
                                  for(int j=0;j<=i;j++)
                                       { 
                                          System.out.print(name);
                                       }
                                    System.out.println();
                             }
                 }
                public void task3(int no)
                  {
                      for(int i=0;i<=5;i++)
                          { 
                             for(int j=5;j>=i;j--)
                                  { 
                                        System.out.print(no);
                                  }
                                   System.out.println();
                           }
                  } 
             public void kiddo()
                 {
                       System.out.println("Hi vinith how are you");
                  }
    }

class first
   {
        public static void main(String[] args) 
            {
                   worker obj1 = new worker();
                   obj1.task1(); 
                   obj1.task2(" kiddo ");
                   obj1.task3(12);
                   obj1.kiddo(); 
            }
    }