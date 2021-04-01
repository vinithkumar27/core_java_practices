class one   //class
   {
         String name;   //global variable
         int age;            //global variable
      /*   one(String name,int age)        //constructor//paramerters//parameter variable
            {
             name=name;
             age=age;
             System.out.println("name: "+name);    //output
             System.out.println("age: "+age);           //output
              }*/
          public void two(String name,int age)
              {
                    name=name;
                    age=age;
                    System.out.println("name"+name);
                    System.out.print("age"+age);
              }
   }   

class fourth          //class 
   {
        public static void main(String args[])        //main method
            {
                   one obj1 = new one(); 
                    obj1.two("kiddo",22);
            }
    }


