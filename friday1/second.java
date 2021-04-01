// this keyword in method
class one
   {
     public void two()
          {
                System.out.println("Hi vinith welcome you man");
                System.out.println("Are you good right now");
           }
     public void three()
          {
              this.two();
              System.out.println("What is this ?");
          }
     public void four()
          {
              this.three();
              System.out.println("this keyword is used to refer current class instance variable,if any ambiguity between instance variable and paramters ,this keyword can resolve this ambiguity");
              
          }
    }
//to save in a object creation, you call onece a time single method only.
class second
   {
       public static void main(String args[])
            { 
                  one obj1 = new one();
                  obj1.four();             
            }
    }