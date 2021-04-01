import java.io.*;
class first
   {
        DataInputStream in = new DataInputStream(System.in);
       first()
          {
      try
        {
     String text =in.readLine();
     int i;
     for(i = 0; i < text.length(); i++)
        {
           System.out.printf("%c", text.charAt(i));
             try{
                     Thread.sleep(100);//0.5s pause between characters
                  }catch(InterruptedException ex)
                 {
                     Thread.currentThread().interrupt();
                  }
           }}catch(Exception t){}
          }     
    }
public class typewriter
   {    
     public static void main(String[] args)
        {
                 first obj1 = new first();
        }
     }