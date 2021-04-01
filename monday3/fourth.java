/* constructor overloading  -is the concept of having more than one constructor with same name of different parameter list ,in such a way ,that each constructor performs different task*/

import java.io.*;
class one 
   {
       int a,b;
        one()
             {
                    System.out.println("hi vinith welcome you man");
                    System.out.println("Enter the values of a and b");              
             }
        one(int q)
             {
                  this();
                  try
                    {
                     DataInputStream in = new DataInputStream(System.in);
                     System.out.println("enter the values of a");
                     int a = in.readInt();
                     System.out.println("enter the values of b");
                     int b = in.readInt();
                    }catch(Exception f){}
             }
         one(String start)
              {
                    this(12);
                    if(a<b)
                       {
                           System.out.println("the LHS is lesser than RHS");
                        }
                     else 
                         {
                              System.out.println("The LHS is greater than RHS");
                          }
               }
    }       

class fourth
    {
          public static void main(String[] args)
              {
                     one obj2 = new one("start");
              }
     }