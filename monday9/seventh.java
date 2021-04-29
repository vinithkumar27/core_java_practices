//Object[] toArray() method
import java.util.*;
class one
   {
      one()
          {
                 ArrayList a1 = new ArrayList();
                 a1.add(1);
                  a1.add(2);
                  a1.add(3);
                  a1.add(4);
                 Object[] obj = a1.toArray();
                  for(Object num : obj)
                     {
                         System.out.print(num + " ");
                     }
          }
    }

class seventh
    {
           public static void main(String[] args)
              {
                     one obj = new one();
              } 
    }