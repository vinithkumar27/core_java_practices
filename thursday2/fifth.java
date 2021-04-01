//CONSTRUCTOR OVERLOADING
/*A CLASS MAY HAVE SEVERAL CONSTRUCTOS,ALL THE CONSTRUCTORS SHAREING THE SAME NAME AND DIFFER WITH TYPE SIGNATURE */

class one
    {
         one()
             {
                    System.out.println("Hi i am normal constructor"); 
              }
         one(int a)
              {
                     System.out.println("Hi i have interger parameter of "+a);
              } 
          one(String b)
              {
                     System.out.println("Hi i have String parameter of "+b);
              }
           one(int a,String b)
               {
                      System.out.println("Hi i have both integer and string parameters of "+a+" "+b);
                }
     }

class fifth
    {
         public static void main(String[] args)
             {
                  one obj1 = new one(123,"vinith");               
              }
      }