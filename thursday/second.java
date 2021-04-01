import java.util.Scanner;
class one
    {
         one()
            {
                 Scanner in = new Scanner (System.in);
                  System.out.println("Enter the values to increment");
                  int n = in.nextInt();
                  int a,b,c,d;
                  a = ((n/1000)+2);     //5696   5
                  n = n%1000;   //696
                  b = ((n/100)+2);       //6
                  n = n%100;     //96
                  c = ((n/10)+2);         //9
                  n = n%10;        //6        7818
                  d = (n+2);
                  System.out.println(a+""+b+""+c+""+d);
            }

}


class second
   {
        public static void main(String[] args)
            {
                    one obj1 = new one();
            }
    }

