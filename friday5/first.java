interface hi
   {
        public void welcome();  
    }

class one implements hi
    {
         one()
           {   
                 System.out.println("Hi iam one constructor");
            } 
        public void welcome()
           {
        System.out.println("Hi iam welcome");
         }
      }

class first
   {
        public static void main(String[] args)
           {
                 one obj1 = new one();              
            }
    }