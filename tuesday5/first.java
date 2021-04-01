class one
    {
  int age;
  String name,address;
   
          one(int age,String name)
            {
                   this.age=age;
                  this.name=name;
            }
          one(int age,String name,String address)
              {
                     
                     this.address=address; 
this(age,name);       
              }
           public void two()
               {
                    System.out.println(age+" "+address+" "+name);
               }
     }

class first
   {
       public static void main(String[] args) 
          {  
                 one obj1 = new one(23,"vinith","xxx");
                 obj1.two();          
          }
    }