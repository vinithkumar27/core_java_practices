//List--Stack--get() set() methods 
import java.util.*;
class one
   {
      one()
          {
                  Stack<String>a = new<String>Stack();
                  a.push("vinith");
                  a.push("goku");
                  a.push("amrish"); 
                  a.push("erainubu");
                  System.out.println("i get a value of "+a.get(1));
                  a.set(1,"barath");
                  for(String b:a)
                    {
                           System.out.println(b);
                     }            
          }
   }

class fifth
  {
      public static void main(String[] args)
          {
                one obj = new one();
           }
   }