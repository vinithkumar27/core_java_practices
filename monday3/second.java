/*extends --The extend keyword extends the class (That inherits one class attributes and methods from one class to another class ),in derived class - the class that inherits from another class , in base class - the class being derived from */

class mumbai
    {
           public void rohit()
             {
                  System.out.println("Hi iam opener in india A squad");           
             }
            public void pandya()
              {
                    System.out.println("Hi iam finisher in india A squad");
               }
     }

class chennai extends mumbai
     {
          public void dhoni()
             {
                     System.out.println("Sorry i am not interested to play for team india A squad");
             }
          public void jaddu()
             {
                     System.out.println("i am the best fielder of team A indian squad ");
             }
     }

class second
   {
        public static void main(String[] args)
            {
                     chennai players = new chennai();
                     players.jaddu();    
                     players.pandya();
            }
    }