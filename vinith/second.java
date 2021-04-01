class one       //base class | super class
     {
           public void two()
                  {
                       System.out.println("Hi iam base class 1st method of two");       
                  }
           public void two1()
                 {
                       System.out.println("Hi iam base class 2nd method of two1");
                  }
     }
 
class three extends one      //immediate derived class
     {
           public void four()
                {
                      System.out.println("Hi iam 1st immediate derived class of four");
                }
            public void four1()
                {
                      System.out.println("Hi iam 2nd immediate derived class of four1");
                 }
        }

class five extends three    //derived class
         {
               public void six()
                  { 
                     System.out.println("Hi i am from derived class of six ");
                  }
         }
 
class second    //
     {
           public static void main(String[] args)
                {
                     three obj1 = new three();
                     obj1.four1();  
                 } 
      }