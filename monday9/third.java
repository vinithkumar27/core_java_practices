import java.util.*;
class one
   {
        one()
            {
                    ArrayList a = new ArrayList(); 
                    a.add("object");
                    a.add("methods");
                    a.add("funcitons");
                    a.add("inheritance");
                    a.add("polymorphism");
                    System.out.println("before removeing of list : "+a);
                    a.remove("methods");
                    a.remove(3);
                    System.out.println("after removing of list : "+a);
             }
    }

class third
   {
       public static void main(String[] args)
         {
                 one obj = new one();
          }
    }