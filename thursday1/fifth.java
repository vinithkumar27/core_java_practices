class one
   {
       String name;
       int age;
        public void two(String name,int age)
           {
                name=name;
                age=age;
                System.out.println("Name  : "+name);
                System.out.println("Age : "+age);            
           }
    }

class fifth
   {
       public static void main(String args[])
           { 
                 one obj1 = new one();
                 obj1.two("Ram",23);
           }
    }

 