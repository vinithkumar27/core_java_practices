  /* A class may have several methods, all the methods shareing the same name and differ from type signature
      in a single class may have a two or more methods by a same name,if the arguments are differ.
                       method overloading    */

 class one
   {
        public void rohit()
            { 
                 System.out.println("i am first method in this class");
             }
         public void rohit(int x)
             {
                   System.out.println("i am with the number of "+x);        
              }
         public void rohit(String name)
               {
                     System.out.println("i am with the name of "+name);
                }
    }

class third
   {
        public static void main(String[] args)
            {
                   one obj1 = new one(); 
                    obj1.rohit(7);             
             }
     }