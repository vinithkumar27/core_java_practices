import java.io.*;
class one
   { 
        public void operation1(int a,int b,String operation)
           {
          try
           {
             DataInputStream in = new DataInputStream(System.in);
             System.out.println("Enter the type of operation ");
             String operation = in.readLine();
                 if(operation.equals("G"))
                    {
                         System.out.println(a>b);
                     }
                  else if(operation.equals("GE"))
                     {
                          System.out.println(a>=b);  
                     }
                 else if(operation.equals("L"))
                     {
                           System.out.println(a<b);
                     }
                 else if(operation.equals("LE"))
                     {
                           System.out.println(a<=b);
                     }
                 else if(operation.equals("E"))
                     {
                          System.out.println(a==b);
                     }
                  else if(operation.equals("NE"))
                     {
                          System.out.println(a!=b); 
                      }
                  else
                     {
                          System.out.println("Select correct one");
                     }
            }
         catch(Exception g){}
         }
    }               
            
class first
   {
       public static void main(String[] args)
          {
              one obj1 = new one();
              obj1.operation1(10,20," ");
              obj1.operation1(30,40,"E");
              obj1.operation1(40,40,"NE");
          }
    }