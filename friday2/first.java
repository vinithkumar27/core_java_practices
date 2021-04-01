import java.io.DataInputStream;
class one
    { 
        
        one()
           {
                   try
                    {
                       DataInputStream in = new DataInputStream(System.in);
                       String name = in.readLine();
                       System.out.println("Hi  "+name);
                     }catch(Exception s){}
            }   
     }

class first
    {
         public static void main(String[] args)
             {
                    one obj2 = new one();
             }
     }

