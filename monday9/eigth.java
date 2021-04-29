import java.util.*;
class one
   {
       one()
            {
                  ArrayList a1 = new ArrayList();
                  a1.add("java"); 
                  a1.add("python");
                  a1.add("react");
                  a1.add("c");
                  System.out.println("unsorted : "+a1);
                  a1.sort(Comparator.naturalOrder()); 
                  System.out.println("sorted : "+a1);            
            }
    }

class eigth
   {
        public static void main(String[] args) 
            {
                 one obj = new one();  
            }
    }