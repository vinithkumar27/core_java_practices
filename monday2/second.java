class one
    {
      String name;
      int age;
      float percent;
        one(String name,int age,float percent)
            {
                this.name=name;
                this.age=age;
                this.percent=percent; 
              
            }
         one(double output)
             {
                     System.out.println("you are fully qualified right now ");    
             }
        public void hi()
             {
                  System.out.println("Hi mr."+name);   
             }
       public void age()
             {
                  System.out.println("your age is "+age);
             }
       public void percent()
              {
                   this.hi();
                   this.age();
                   this(12345.2345);
                   System.out.println("your percent is "+percent);
              }
    }


class second
    {
         public static void main(String[]args)
             {
                  one obj1 = new one("charvik",4,99.9f);
                  obj1.percent();      
             }
    }