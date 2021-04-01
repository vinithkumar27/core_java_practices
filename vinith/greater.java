import java.util.Scanner;
class which
        {
             which()
                 {
                        Scanner in = new Scanner (System.in);

                        System.out.println("To find which is the greatest no: ");
                        System.out.println("To enter the values of a");
                        int a = in.nextInt();
                        System.out.println("To enter the values of b");
                        int b = in.nextInt();
                        System.out.println("To enter the values of c");
                        int c = in.nextInt();

                            if((a>b)&&(a>c))
                                      {
                                              System.out.println("The value of a is big");
                                      }
                            else if ((b>a)&&(b>c))
                                      {
                                             System.out.println("The value of b is big");
                                      }
                             else 
                                       {
                                              System.out.println("The value of c is big");
                                        }

                  }
        }


class greater
         {
                  public static void main(String args[])
                          {
                                 which no1 = new which();
                           }
          }
             