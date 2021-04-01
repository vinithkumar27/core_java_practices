import java.io.*;
class one
   {
         public void two()
              {
                 try
                   {
                   DataInputStream in = new DataInputStream(System.in);
                   System.out.println("Enter the weight please ");
                   double weight =Double.valueOf(in.readLine()).doubleValue();
                   System.out.println("hi "+weight);
                   if(weight<20)
                       {
                          System.out.println("The product is selected for First level catogries");
                       }
                   else if((weight>=20)&&(weight<=30))
                       {
                            System.out.println("The product is selected for Second level categories");
                        }  
                   else if((weight >=31)&&(weight<=40))
                        {
                             System.out.println("The product is selected for third level categories");
                         }
                   else
                         {
                               System.out.println("The product is in over weight so rejected");
                          }          
                        }catch(Exception e){}
                   }
        }

class second
    {
         public static void main(String[] args)
             {
                   one obj1 = new one();
                   obj1.two();
                   
             }
     }
