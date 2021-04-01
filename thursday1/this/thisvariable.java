class one
    {
         String name;          
         int age;
         one(String name,int age)     
             {
                 this.name=name; 
                 this.age=age;        
                 System.out.println("Hi" + name + age);
              }
          public void two()
              {
                 System.out.println("The entered values are "+name);
                 System.out.println("The entered age is "+age);
              }         


     }
class thisvariable
    {
        public static void main(String args[])
             {
                      one obj1 = new one("vinith",23);
                       obj1.two();
             } 
     }

/*D:\thursday1\this>java thisvariable
Hivinith23
The entered values are null
The entered age is 0

D:\thursday1\this>javac thisvariable.java

D:\thursday1\this>java thisvariable
Hivinith23
The entered values are vinith
The entered age is 23  */