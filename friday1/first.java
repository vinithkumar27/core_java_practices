//this keyword in variables
class one
    { 
         String name;
         int rollno; 
         one(String name,int rollno)
            {
              this.name=name;
              this.rollno=rollno;           
            }
          public void two()
             {
                 System.out.println("Enter your roll no p1 :"+rollno);
                 System.out.println("Enter your name p1 :"+name);
              }
           public void three()
               {
                    System.out.println("Enter your roll no p2 :"+rollno);
                    System.out.println("Enter your name p2 :"+name);
               }
     }
//to save a memory in variable name in parameters.
class first
    {
         public static void main(String arg[])
            {
                 one obj1 = new one("barath",124);
                 obj1.two();
                 one obj2 = new one("gokul",134);
                 obj2.three();            
            }
    }