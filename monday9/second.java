import java.util.*;
class one
   {
      ArrayList a = new ArrayList();
       one()
           {
                a.add("lynn");
                a.add("rohit");
                a.add("surya");
                a.add("ishan");
                a.add("pollard");
                
                 System.out.println("Change element in arraylist : ");
                 a.set(0,"De cock"); 
                 System.out.println(a);               
           }
    }

class second
   {
        public static void main(String[] args)
            {
                  one obj = new one();
            }
   }