//clone() method
import java.util.*;
class one
   {
          one()
              {
                    ArrayList a1 = new ArrayList();
                    a1.add("java");
                    a1.add("python");
                    a1.add("javascript");
                    a1.add(1000);
                    System.out.println(a1);
                    ArrayList a2 = new ArrayList();
                    a2 = (ArrayList)a1.clone();
                    System.out.println(a2);
               }
    }
class sixth 
   {
        public static void main(String[] args) 
             {
                     one obj = new one();
              }
    }