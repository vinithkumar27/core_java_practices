//removeAll() method
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
                  ArrayList a2 = new ArrayList();
                  a2.add(1);
                  a2.add(2);
                  a1.removeAll(a2);
                  System.out.println(a1);
           }
   }

class ninth
   {
        public static void main(String[] args)
              {
                 one obj = new one();  
              }
    }