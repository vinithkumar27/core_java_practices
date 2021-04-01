//this keyword used in variables
class one 
    { 
         String name;
         int age;
         one(String name,int age)
             {
                  this.name=name;
                  this.age=age;
             }
          public void two()
              {
                   System.out.println(name);
                   System.out.println(age); 
              }
     }

class second 
    {
         public static void main(String[] args)
             {
                    one obj1 = new one("vinith",23);
                    obj1.two();         
              }
     }