class one 
  {
       String name,country,state;
       int age;
       one(String name,int age,String country)
           {
               this.name=name;
               this.age=age;
               this.country=country;          
            }
        one(String name,int age,String country,String state)
            {
                  this(name,age,country);
                  this.state=state; 
             }
        public void two()
              {
                      System.out.println(name);
                      System.out.println(age);
                      System.out.println(country);
                      System.out.println(state);
              }
   }

class first
   {
       public static void main(String[] args)
          {
                one obj1 =  new one("kiddo",23,"india","tamil nadu"); 
                 obj1.two();
           }
    }