//HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
import java.util.*;
class one
   {
        one()
             {
                      HashSet a = new HashSet();
                      a.add("one");
                      a.add("two");
                      a.add("three");
                      a.add("four");
                      a.add("five");
                      a.add("six");
                      Iterator i = a.iterator();
                      while(i.hasNext())
                         {
                               System.out.println(i.next());
                          }             
              }  
     }

class first
   {
       public static void main(String[] arsg)
            {
                  one obj = new one();
            }
    }