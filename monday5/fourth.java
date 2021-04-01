import java.io.*;
class one
     {
          DataInputStream in = new DataInputStream(System.in);
          int[][] x = new int[3][3];
          one()
              {
                   for(int i=0;i<3;i++)
                       {
                         for(int j=0;j<3;j++)
                            {
                            try
                              {
                                  x[i][j]=Integer.parseInt(in.readLine());
                               }
                            }catch(Exception t){}
                       }
                   for(int =0;i<3;i++)
                        {
                          for(int j=0;j<3;j++)
                              {
                                   System.out.println(x[i][j]);
                               }         
                         }
                }

class fourth
    {
         public static void main()
              {
                   one obj2 = new one();        
              }
      }