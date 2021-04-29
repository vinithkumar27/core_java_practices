import java.util.*;
import java.io.*;
class one 
   { 
        LinkedHashSet a;
        HashSet a1 ;
        int run;
        Iterator i;
        DataInputStream in = new DataInputStream(System.in);
        one()
            {
                   try
                     {
                    System.out.println("LinkedHashSet(0)/HashSet(1)");
                    run = Integer.parseInt(in.readLine());  
                    System.out.println("\n");
                    if(run == 0)
                       {
                           a = new LinkedHashSet();
                           a.add("one");
                           a.add("two");
                           a.add("three");
                           a.add(1);
                           a.add(2);
                           a.add(3);
                           i =a.iterator();
                        }
                   else if(run == 1)
                      {
                             a1 = new HashSet();
                             a1.add("one");
                             a1.add("two");
                             a1.add("three");
                             a1.add(1);
                             a1.add(2);
                             a1.add(3);
                             i =a1.iterator();
                      } 
                    else
                      {
                           System.out.println("Enter 0 or 1 only");
                      }
                 
                   while(i.hasNext()) 
                     {
                             System.out.println(i.next());
                      }   
                  }catch(Exception e){}          
            }   
   }

class fourth
   {
       public static void main(String[] args)
          {
               one obj = new one();
           }
    }