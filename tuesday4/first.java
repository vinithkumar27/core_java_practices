class one
    {
        int rollno,age;
        String name;
        static String college = "kkr";  /*static variables are initialized only once,at start of execution,a static variable is used to refer to the common proporty of all objects.  */
        
         one(int rollno,int age,String name)
            {
                 this.rollno=rollno;
                 this.age=age;
                 this.name=name;  
                 
            }
         public void two()
               {
                    System.out.println("Roll no of student "+rollno);
                    System.out.println("Age of the student "+age);
                    System.out.println("Name of the student "+name);
                    System.out.println("name of the college "+college);
               }
     }


class first
   {
        public static void main(String[] args) 
             {
                    one obj1 = new one(128,23,"vinith");
                    one obj2 = new one(127,22,"Vignesh");
                    one obj3 = new one(126,22,"venkat");
                    one obj4 = new one(125,23,"venkadesh");
                     obj1.two(); 
                     obj2.two();
                     obj3.two();     
                     obj4.two();
              }
     }