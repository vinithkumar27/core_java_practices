//MULTIPLE INHERITANCE

class one
   {
     one()
        {
          System.out.println("Hi iam base class");    
         }
    }

class one1 extends one
   {
       one1()
           {
               System.out.pritnln("Hi iam immediate derived class");
            }
    }

class one2 extends one1,one      //hence multiple inheritance are not supported by java
    {                                                  //to inherite a single class only at a time
       one2()                                     /*to access a multiple base class to the single derived class                                                           at a time is known as multiple inheritance*/
           {
              System.out.println("Hi iam derived class");
            }
     } 


class third 
    {
          public static void main(String[] args)
               {
                    one2 obj1 = new one2();                
               }
     }