
class one
     {
          public void turn()
                {
                    int sum,n,a,b,c,d,e;
                    n = 23456;
                    a=n/10000;  // first  2
                    n=n%10000;  // n 3456
                    b=n/1000;     // second 3
                    n=n%1000;  // n 456
                    c=n/100;     // third 4
                    n=n%100;    // n 56
                    d=n/10;     //   fourth 5
                    n=n%10;    // n  6
                    e=n;

                    sum=d+e;
                    System.out.println(sum);                    
                 }
     }
class first
     {
         public static void main(String[] args)
              {
                     one obj1 = new one();
                     obj1.turn(); 
               }
      }