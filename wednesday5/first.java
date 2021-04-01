package kiddopackages;
import java.io.*;
public class typewriter
   {
    
     public static void main(String[] args)
        { DataInputStream in = new DataInputStream(System.in);
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