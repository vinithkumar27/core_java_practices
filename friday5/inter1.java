import packages.interfacepack;
class sample implements interfacepack
   {
      public void pandya()
         {
               System.out.println("Hello java");         
         }
      public void rohit()
          {
                System.out.println("Hello rohit"); 
          }
   }


class inter1
   {
       public static void main(String[] args)
          {
              sample obj = new sample();
              obj.pandya();
              obj.rohit();
          }
    }