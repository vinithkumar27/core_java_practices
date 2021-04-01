//this keyword 
class one
   {
     String name;
     int age;
     float percentage; 
        one(String name,int age,float percentage)
             {
                  this.name=name;
                  this.age=age;
                  this.percentage=percentage;    
             }
         public void two()
             {
                System.out.println("your name  "+name); 
                System.out.println("you age  "+age);
                System.out.println("your percentage  "+percentage);
             }
    }

class first
   {
         public static void main(String []args)
             {
                   one obj1 = new one("kiddo",23,80.0f);
                   obj1.two();
             }
    }