import java.io.*;
class one
    {
         public void two()
             {
                try
                  {
                   DataInputStream in = new DataInputStream(System.in);
                   System.out.println("Enter the value of a");
                   int a = in.readInt();
                   System.out.println("Enter the address");
                   String address = in.readLine();
                   System.out.println("Enter the phone no");
                   int phone = in.readInt();
                   }catch(Exception s){}
               }
     }

class second
    {
          public static void main(String[] args)
              {
                    one obj2 = new one(); 
                    obj2.two();   
               }
     }