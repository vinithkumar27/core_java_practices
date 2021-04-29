import java.util.*;
class one
   {
       ArrayList a = new ArrayList();
       one()
           {
               a.add("duplessis");
               a.add("gaikwad");
               a.add("raina");
               a.add("rayudu");
               a.add("dhoni");   
             
             System.out.println(a);

             a.add(3,"curren");

             System.out.println(a);
            }
    }

class first
   {
       public static void main(String[] args)
          {
               one obj = new one();
          }
    }