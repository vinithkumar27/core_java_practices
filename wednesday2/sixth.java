//this keyword used as chaining 
class one
   {
       String name,state,district,village,town;
       int age;
       one(String name,int age,String state,String district)
          {
               this.name=name;
               this.age=age;
               this.state=state;
               this.district=district;  
          }
       one(String name,int age,String state,String district,String village,String town)
            {
                 this(name,age,state,district);
                  this.village=village;
                  this.town=town; 
            }
       public void two()
            {
                 System.out.println("The name of the person is :"+name); 
                 System.out.println("The age of the person is :"+age);
                 System.out.println("Persons birth state and district :"+state+" "+district);
                 System.out.println("Persons birth villlage and town :"+village+" "+town);
             }
    }
 
class sixth
   {
        public static void main(String[] args)
          {
                one obj1 = new one("vinith",23,"tamilnadu","salem","shevapet","salem town");
                obj1.two();      
          }
    }