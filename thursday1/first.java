class one
   {
       String name;
        int age;
       public void two(String name,int age)
           {
               name=name;
               age=age;
               System.out.println("Enter name "+name);
               System.out.println("Enter age "+age);   
           }
   }

class first
   {
       public static void main(String[] args)
           {
                   one oj1 = new one();
                   oj1.two("kiddo",22);
            }
    }