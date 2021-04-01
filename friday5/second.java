interface kiddo
   {
       public void welcome();
    }

interface ramu extends kiddo
    {
        public void uber();
    }

class one implements ramu
     {
          public void welcome()
             {
                  System.out.println("Hi iam from derived class");
              }
          public void uber()
              {
                  System.out.println("Hi iam from second derived class");
                }
      }

class second
   {
        public static void main(String[] args)
           {
               one obj = new one();
               obj.welcome(); 
               obj.uber();
           }
    }