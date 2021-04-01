import java.io.*;
class one
   {
         DataInputStream in  = new DataInputStream(System.in);
         one()
            {
                 try
                  {
                  System.out.println("Enter value of a");
                  int value = Integer.parseInt(in.readLine());
                  System.out.println(value);
                  }catch(Exception w){}             
              }
 
    }

class first
   {
         public static void main(String[] args)
           { 
                 one obj = new one();
            } 
    }

