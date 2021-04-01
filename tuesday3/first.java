//tuesday3  first  output issue
import java.io.DataInputStream;
class one 
    {
          public void two()
             {
                try
                  {
                  DataInputStream obj2 = new DataInputStream(System.in);
                  System.out.println("Enter the value of a ");
                  int a = Integer.valueOf(obj2.readLine()).intValue();
                  System.out.println("Enter the value of b");
                  int b = Integer.valueOf(obj2.readLine()).intValue();
                  int c=a+b;
                  System.out.println("The addition of two values are "+c);
                  }catch(Exception g){}                     
              }
     }

class first
   {
        public static void main(String[] args)
           {
                 one obj1 = new one();
                 obj1.two();              
           }
    }