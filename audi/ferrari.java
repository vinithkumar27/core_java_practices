class sample
       {
             sample(String s)
                  {
                        System.out.println("Enter your name please");
                        System.out.println(""+s);
                  }
            sample(int x,int y,int z)
                 {
                       System.out.println("Enter your date of birth");
                       System.out.println("my date is "+x);
                       System.out.println("my month is "+y);
                       System.out.println("my year is "+z);
                 }
             sample(float a)
                 {
                        System.out.println("Enter your average strick rate");
                        System.out.println("my avg.rate is  "+a);
                 }
             sample(double b)
                 {
                        System.out.println("Enter your full strick rate ");
                        System.out.println("my lifetime full rate is "+b);
                 }
       }
 

class ferrari
        {
              public static void main(String args[])
                    {
                          sample s1 = new sample("vinith kumar");
                          sample s2 = new sample(27,10,1999);
                          sample s3 = new sample(196.25f); 
                          sample s4 = new sample(500.6);   
                     }
         }
             