class one
   {
        public void raj()
            {
              for(int i=5;i>0;i--)
                  {
                     for(int j=0;j<i;j++)
                           {
                               System.out.print((char)+(i+65));
                            }
                        System.out.println();
                      }        
            }
    }


class eleventh
    {
         public static void main(String[] args)
             {
                    one obj1 = new one();
                    obj1.raj();             
             }
     }