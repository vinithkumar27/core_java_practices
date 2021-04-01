import java.util.Scanner;
class one
    {
          one()
              {
                    Scanner in = new Scanner(System.in);
                    System.out.println("reverse a number");
                    int  n= in.nextInt();
                    int a,b,c,reverse;
                    a=n/100;      //first
                    n=n%100;
                    b=n/10;       //second
                    c=n%10;     //third
                  
                   reverse = c*1000 + b*100 + a;
                   System.out.println(reverse);
                    
}}



class third
   {
        public static void main(String[] args)
             {
                   one obj2 = new one();  
             }

    }
