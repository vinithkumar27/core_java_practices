abstract class one 
   {
      abstract public void two();
    }

class three extends one
     {
           public void five()
                 {
                        System.out.println("Hi vinith we wont use for you");
                  }
          public void rohit()
                  {
                         System.out.println("Hi rohit welcome you");
                   }
     }

class fifth
    {
        public static void main(String[] args)
            {
                    three obj1 = new three();
                    obj1.five();
                    obj1.rohit();  
             }
     }