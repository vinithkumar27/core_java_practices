class one
    {
       String name,fathername,mothername;
       int age;
        one(String name,int age)
            {
                 this.name=name;
                 this.age=age;
             }
         one(String name,int age,String fathername)
             {
                  this(name,age);
                  this.fathername=fathername;
             }
         one(String name,int age,String fathername,String mothername)
             {
                  this(name,age,fathername);
                  this.mothername=mothername;
              }
          public void two()
              {
                    System.out.println(name);
                    System.out.println(age);
                    System.out.println(fathername);
                    System.out.println(mothername);
              }
      }
            

class seventh 
    {
         public static void main(String[] args)
             {
                   one obj1 = new one("vinith",23,"kannan","logu");
                    obj1.two(); 
             }
     }