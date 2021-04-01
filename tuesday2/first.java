import java.util.Scanner;
class aadhar 
   {
     String name;
     String father_name;
     String mother_name;
     int age;
     int father_age;
     int mother_age;
     String address;
        aadhar()
             {
                  this.name=name;
                  this.father_name=father_name;
                  this.mother_name=mother_name; 
                  this.age=age;
                  this.father_age=father_age;
                  this.mother_age=mother_age;
                  this.address=address;   
              }
        public void person1()
              {    
                   Scanner in = new Scanner(System.in); 
                   System.out.println("Enter your name");
                   String name = in.nextLine();
                   System.out.println("Enter your age");
                   int age = in.nextInt();
                   System.out.println("The person name :"+name+"and age of "+age);
                   System.out.println("The person father_name :"+father_name+" and age of "+father_age);
                   System.out.println("The person mother_name :"+mother_name+"and age of "+mother_age);
                   System.out.println("Their address of house is :"+address);
               }
         public void person2()
              {
                   System.out.println("The person name :"+name+"and age of "+age);
                   System.out.println("The person father_name :"+father_name+" and age of "+father_age);
                   System.out.println("The person mother_name :"+mother_name+"and age of "+mother_age);
                   System.out.println("Their address of house is :"+address);
               }
    }               


class first
    {
         public static void main(String[] args)
             {
                  aadhar p1 = new aadhar();
                  p1.person1();
                  aadhar p2 = new aadhar();
                  p2.person2();
             } 
     }
  
