import java.io.DataInputStream;
class one
    {
         one()
             {
                 try
                   {
                    DataInputStream in = new DataInputStream(System.in);
                    System.out.println("Enter the value of a ");
                    int a = in.readInt();
                    }catch(Exception s){} 
             }
      }

class third
    {
         public static void main(String[] args)
              {
                    one obj1 = new one();   
              }
     }