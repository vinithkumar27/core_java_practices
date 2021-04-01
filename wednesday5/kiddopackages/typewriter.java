package kiddopacakages;
import java.io.*;
public class typewriter
    {
     DataInputStream in = new DataInputStream(System.in);
         typewriter()
             {
               try
                 {
                  System.out.println("Enter the words");
                  String text = in.readLine();
                  for(int i = 0; i < text.length(); i++)
                      {
                          System.out.printf("%c", text.charAt(i));
                          try{
                              Thread.sleep(200);//0.2s pause between characters
                               }catch(InterruptedException ex)
                              {
                               Thread.currentThread().interrupt();
                              }
                        } }catch(Exception t){}
               }
    }
