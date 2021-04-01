import java.util.Scanner;	
class one
   {
         int i=1;
         public void dooropen()
             {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter your password please ..");
                int password = in.nextInt();
                if(password ==6789)
                   {
                        System.out.println("hi mr.vinithkumar");
                   }
                else if(i<=3)
                   { 
                        System.out.println("incorrect password ,try again");
                        i++; 
                        dooropen();
                   }
                 else
                   {
                        System.out.println("Sorry your account is closed");
                        System.exit(0);
                    }
                 doorclose();
               }

          public void doorclose()
               { 
                  Scanner in = new Scanner(System.in);
                  System.out.println("mr.vinith can i close the door ");
                  String close = in.nextLine();
                  if(close.equals("y"))
                     {
                         System.out.println("thankyou the door is close right now");
                      }
                   else if(close.equals("n"))
                      {
                          System.out.println("ok vinith i will wait for you");  
                       }
                   else 
                       {
                          System.out.println("vinith please respond");
                          doorclose();
                        }
                          enginestart();
                   }

           public void enginestart()
                 {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Can i start enigne vinith"); 
                    String start =in.nextLine();
                     if(start.equals("y"))
                            {
                                 System.out.println("Lets's starts our journey"); 
                             }
                      else if(start.equals("n"))
                            {
                                  System.out.println("ok will wait for your command");
                                  System.exit(0);
                             }
                                  airconditioner();
                     }
                                
            public void airconditioner()
                   {
                       Scanner in = new Scanner(System.in);
                       System.out.println("vinith can i start airconditioning mode");
                       String switchon = in.nextLine();
                        if(switchon.equals("y"))
                             {
                                System.out.println("The air conditioner starts now ..");
                                gearsystem();
                              }
                        else if(switchon.equals("n"))
                             {
                                 windowrequest();
                              }
                       }

            public void windows()
                   {
                       Scanner in = new Scanner(System.in);
                       System.out.println("check the speed of the car");
                       int speed = in.nextInt();
                       if((speed>=1)&&(speed<30))
                          {
                             System.out.println("The window door opens at 100%");
                          }
                        else if((speed>=30)&&(speed<80))
                          {
                             System.out.println("The window door opens at 60%");
                          }
                        else if((speed>=80)&&(speed<150))
                          {
                              System.out.println("The window door opens at 30%");
                           }
                        else if(speed == 0)
                            {
                               System.out.println("The window door opens at 100%");
                               System.exit(0);
                            }
                         else
                            {
                                System.out.println("The window door opens fully");
                             }
                      airconditioner();
                     }

           public void gearsystem()
                 {
                    Scanner in = new Scanner(System.in);
                    System.out.println("check the speed of the car");
                    int speed = in.nextInt();
                    if(speed == 0)
                       {
                           System.out.println("The gear at Neutral mode");
                       }
                    else if(speed<30)
                       {
                          System.out.println("The gear shifted to first gear");
                        }
                    else if((speed>=30)&&(speed<60))
                        {
                          System.out.println("The gear shifted to second gear");
                        }
                     else if((speed>=60)&&(speed<120))
                        {
                          System.out.println("The gear shifted to third gear"); 
                        }
                     else if((speed>=120)&&(speed<160))
                        {
                          System.out.println("The gear shifted to fourth gear");
                        }
                     else if(speed<0)
                       { 
                          System.out.println("The gear shifted to reverse gear");
                       }
                     else
                        {
                          System.out.println("The Turbo mode On");
                        }
                  }

          public void windowrequest()
                {
                    Scanner in = new Scanner(System.in);
                    System.out.println("can i open windows");
                    String windowrequest = in.nextLine();
                    if(windowrequest.equals("y"))
                      {
                         System.out.println("The windows are open now");
                         windows();
                       }
                    else
                      {
                         System.out.println("Thankyou i will wait for your command");
                         System.exit(0);
                      }
                  }
     }


class fourth
    {
          public static void main(String[] args)
                {
                       one obj1 = new one();
                       obj1.dooropen();
                }
     } 
  