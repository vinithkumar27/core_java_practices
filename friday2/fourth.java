import java.io.*;
class one
   {
       String name;
       int age;
       int height;
       int number;
       one()
          {
             try
               {
               DataInputStream in = new DataInputStream(System.in);
               System.out.println("Enter your name ");
               String name = in.readLine();
                this.name=name;
               System.out.println("Enter your UserID");
               String userid = in.readLine();
                }catch(Exception a){}           
          }
       one(int x)
           {
               try
                  {
                   DataInputStream in = new DataInputStream(System.in);
                   System.out.println("Enter your no ");
                   int number = in.readInt();
                   this.number=number;
                    }catch(Exception a){}
           }
        public void rent()//one(float y)
            {
                 try
                     {
                       DataInputStream in = new DataInputStream(System.in);
                       System.out.println("Enter your height ");
                       int height = in.readInt();
                       this.height=height;
                      }catch(Exception a){}
             }
        
    }

class two extends one
    {
         two()
              {
                   rent();
                   System.out.println("Hi "+name+" you are"+age+" and your height "+height+" and your no"+number); 
               }
     }

class fourth
   {
        public static void main(String[] args)
           {
                two obj1 = new two();
                obj1.rent();    
           }
    }