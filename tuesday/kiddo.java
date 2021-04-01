import java.util.Scanner;
// NAME
class name 
      {
           name()
                { 
                      Scanner in = new Scanner(System.in);
                      System.out.println("Enter your name please");
                      String name = in.nextLine();
                }
       }
                                   

//AGE
class age
       {
            age()
               {
                      Scanner in1 = new Scanner(System.in);
                      System.out.println("Enter your age please");
                      int age = in1.nextInt();
                      int minimum = 18;
                      if(age>=18)
                          {
                                  System.out.printf("Hi and age of %d you are qualified now%n",age);
                           }
                     else
                          {
                                   System.out.printf("Sorry vinith you are not qualified because your age is less than %d %n",minimum);
                                   
                          }
                 }
       }


//HEIGHT
class height
        {
             height()
                   {
                         Scanner in2 = new Scanner(System.in);                         
                         System.out.println("Enter your height please");
                         int height = in2.nextInt();
                         int stndheight = 170;
                               if((height >=170)&&(height<=175))
                                       {
                                                 System.out.printf("your height is %d  and you are qualified%n",height);
                                       }
                               else if((height>176)&&(height<180))
                                      { 
                                                  System.out.printf("you are selected for first level category%n");
                                      }
                               else
                                      {
                                                  System.out.printf("You are not qualified because your height less than %d standard height%n",stndheight);
                                                  
                                      }
                        }
        }
 

//WEIGHT
class weight
      {
            weight()
                {
                        Scanner in3 = new Scanner(System.in);
                        System.out.println("Enter your weight please");
                        int weight = in3.nextInt();
                        if(weight>81)
                             {
                                  System.out.printf("you are at over weight of %d",weight);
                              }
                         else if((weight>80)&&(90<weight))
                                {
                                    System.out.println("you are selected for first level category");
                                }
                          else if((weight>70)&&(60<weight))
                               {
                                     System.out.println("you are selected for second level category");
                               }
                           else  
                               {
                                     System.out.println("you are at less weight and better luck next time");
                                     
                                }
                     }
    }


class kiddo
      {
            public static void main(String args[])
                {
                      name obj1= new name();
                      age obj2 = new age();
                      height obj3 = new height();
                      weight obj4 = new weight();
                }
      }