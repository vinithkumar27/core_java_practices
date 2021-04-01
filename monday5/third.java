import java.io.*;
class one
   {
        DataInputStream in = new DataInputStream(System.in);
        int[] x = new int[5];
         one()
            {
               try
                 {
                for(int i=0;i<5;i++)
                    {
                        x[i]=Integer.parseInt(in.readLine());
                     }
                 for(int j=0;j<5;j++)
                     {
                         System.out.println(x[j]);
                     }
                   }catch(Exception y){}
            }
    }

class third
   {
        public static void main(String[] args)
           {
                one obj1 = new one();         
           }
    }