class demo
       {
           demo(int a,int b)
               {
                   System.out.println("equal to   "+(a!=b));
               }
           public void greaterthan(float c,float d)
               {
                   System.out.println("greater than is not"+(c<=d));
               }
       }
 

class relational
         {
              public static void main(String args[])
                   {
                         demo r1 = new demo(21,21);
                         new demo().greaterthan(20.2f,22.2f);
                   }
         }
                     