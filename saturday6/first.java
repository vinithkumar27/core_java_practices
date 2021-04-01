import java.io.*;
class two
    {
    
         two() 
             {
               try
                 {    
                   DataInputStream in = new DataInputStream(System.in);         
                  System.out.println("Enter your userID");
                  int userid = Integer.parseInt(in.readLine()); 
                  if(userid==1111)
                    {
                          System.out.println("welcome to BharatBenz");
                    }
                   else
                     {
                          System.out.println("Enter correct userID");
                          System.exit(0);
                     }
                  }catch(Exception u){}    
              }
     }

class one extends two implements Runnable
    {
         one()
            {
                super();
               Thread kiddo = new Thread(this);
                System.out.println("This thread no is "+kiddo.());
                String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$#@&*0123456789";
                char[] passwordset = new char[10];
                for(int i = 0;i<=8;i++) 
                   {
                        int rand=(int)(Math.random()*(password.length()));
                        passwordset[i]=password.charAt(rand);
                    }
                System.out.println("your default password is..");
                for(int j=0;j<=8;j++)
                    {
                       try
                         {
                          System.out.print(passwordset[j]);
                          kiddo.sleep(500);
                          }catch(Exception o){}
                     }System.out.println();
                 kiddo.start();
             } 
          public void run() 
             {
                 System.out.println("Thanks for using BharatBenz");
             }
    }

class first
   { 
       public static void main(String[] args)
          {
               Thread main =Thread.currentThread();
               one obj = new one();      
                System.out.println("Don't Forgot your password");
          } 
    }