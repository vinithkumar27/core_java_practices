import java.io.*;
import java.util.Scanner;  
class one
    {
     public void red()
          {
              System.out.println("Hello world");
          }
     }

class two extends one
    {
      public void blue()
        {
        try
          {
         red();
         DataInputStream in = new DataInputStream(System.in);
         System.out.println("Enter the value of a");
         int a = Integer.valueOf(in.readLine()).intValue();
         System.out.println(a);
            }catch(Exception g){}
         }
       }

class three extends two
     {
          public void pink()
              {
               try
                 {
                 blue();
                 DataInputStream in1=new DataInputStream(System.in);
                 System.out.println("Enter the value of b");
                 int b = Integer.valueOf(in1.readLine()).intValue();
                 System.out.println(b);
                  }catch(Exception t){}
               }
       }

class third
    {
         public static void main(String[] args)
             {
                three obj1 = new three();
                obj1.pink(); 	 
             }
     }