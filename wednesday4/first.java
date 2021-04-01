//static variable,static method,static block
class one
    {
        static String school = " GHSS " ;     //static variable
        int rollno,age;
        String name;
        one(int rollno,String name,int age)
             {
                  this.rollno=rollno;
                  this.name=name;
                  this.age=age;
             }
         public void student1()
             { 
                  System.out.println("Student roll no "+rollno);
                  System.out.println("Student name "+name);
                  System.out.println("Student age "+age);
                  System.out.println("Student school "+school);  
              }
          public void student2()
              {
                   System.out.println("Student roll no "+rollno);
                   System.out.println("Student name "+name);
                   System.out.println("Student age "+age);
                   System.out.println("Student school "+school);
               }     
          static     //static block
               {
                     System.out.println("Our students details today"); 
                     System.out.println("A-class");
                }
          public static void student3()                              //static method                         
               { 
                      System.out.println("He is absent today");
               }  
    }
 
class two extends one
     {
          two()
             {
                    System.out.println("B-class");
             }
      } 

class first
    {
         public static void main(String[] args)
             { 
                  one obj1 = new one(120,"steve",15);
                  obj1.student1();
                  one obj2 = new one(128,"mark",15);
                  obj2.student2();
                  one.student3();
             }
     }