//addAll() method
import java.util.*;
class one
   {
         one()
              {
                     ArrayList a1 = new ArrayList();
                      a1.add("vinith");
                      a1.add("java");
                      a1.add(1);
                      ArrayList a2 = new ArrayList();
                      a2.add(2);
                      a2.add("python");
                      a2.add("world");
                       System.out.println(a1.addAll(a2));
                        System.out.println(a1);  
                       ArrayList a3 = new ArrayList();
                        a3.add("run");
                        a3.add("runner");
                        a3.add("runnable");
                       ArrayList a4 = new ArrayList();
                       a4.add(1);
                       a4.add(2);
                       a4.add(3);
                       System.out.println(a3.addAll(1,a4));
                        System.out.println(a3); 
              }
    }
              

class fifth
  {
         public static void main(String[] args)
            {
                    one obj = new one(); 
             }
   }
