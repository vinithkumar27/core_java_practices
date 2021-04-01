//METHOD OVERLOADING
/*THE CLASS MAY HAVE SEVERAL METHODS ,ALL THE METHODS SHAREING THE  SAME NAME
AND DIFFERS WITH TYPE SIGNATURE*/

class one
    {
          public void rohit()
              {
                     System.out.println("The normal method works");
              }
         public void rohit(int x)
              {
                     System.out.println("The integer method works of "+x);
              }
          public void rohit(String name)
              {  
                      System.out.println("The string method works of "+name);      
               }
           public void rohit(int x,String name)
               {
                       System.out.println("The combined method of "+name+" "+x);
                }
     }

class fourth
    {
          public static void main(String[] args)
               {
                   one obj1 = new one(); 
                   obj1.rohit(23,"vinith");                    
               }
      }