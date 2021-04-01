class one
    {
         one()
            {
                    StringBuilder in = new StringBuilder();
                    System.out.println(in.capacity());
                    in.ensureCapacity(20);
                    System.out.println("The output is "+in.capacity());
              } 
     }



class first
   {
       public static void main(String[] arg)
           {
               one obj = new one();      
           }
    }