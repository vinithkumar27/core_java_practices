class one
    {
        String name,address;
        int age;
         one(String name,int age,String address)
            {
                this.name=name;
                this.address=address;
                this.age=age;
            }
         public void two()
             {
                  System.out.println("Name ="+name);
                  System.out.println("Address ="+address);
                  System.out.println("Age ="+age);
              }
       }

class red extends one
      {
           String bio;
           red(String name,int age,String address,String bio) 
              {
                    super(name,age,address);
                    this.bio=bio;
               }
           public void blue()
               {
                       System.out.println("Bio = "+bio);
                }
     }

class first
   {
        public static void main(String[] args)
            {
                   red obj1 = new red("Vinith",23,"XXX","I AM");
                   obj1.blue();
                   obj1.two();
            }
    }