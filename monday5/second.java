/*An interface is a reference type in Java. ... It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface. Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types.
   interface is the one which contains only the abstract methods, and the class which contains methods which gives the definition to those abstract methods are implementation. ... interface provides 100 percent abstraction, and no constructors are allowed in interface. */

interface one
 {
    public void display();
 }

interface two
 {
    public void display1();
 }

interface three
   {
      public void display2(); 
   }

class sample
 {
     int x=10;
   sample()
	{
                       System.out.println("Hello world");  
	}
 }

class sample1 extends sample implements one,two,three
 {
    sample1()
	{
                        System.out.println(x);
	}
     public void display()
                 {
                        System.out.println("Hi vinith");                           
                 }
     public void display1()
                 {
                        System.out.println("Hi kannan");
                 }
    	 public void display2()
                  {
                       System.out.println("Hi runner");
                  }  
 }

class second
  {
     public static void main(String ads[])
	{
                    sample obj1=new sample(); 
	   sample1 obj=new sample1();
                     obj.display();
                     obj.display1();
                     obj.display2();
	}
 }
