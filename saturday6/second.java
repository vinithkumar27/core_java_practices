import java.io.*;
class one
   {
      String name,address,regno,grade;
      int rollno,age,height,weight;  
      String brand = "BharatBenz";
      DataInputStream in = new DataInputStream(System.in);
      one(String regno,int rollno)
         {
            this.rollno=rollno;
            this.regno=regno;            
         }
        
       public void name(String name)
           {
            try
              {
              System.out.println("Enter your name please");
              String name = in.readLine();
               this.name=name;
               System.out.println("Welcome to "+brand+" Mr."+name);
               page1();
              }catch(Exception p){}
           }
       public void page1()
          {
              try
                {
               System.out.println("Enter your regno. please!");
               String regno = in.readLine();
               if(regno.equals("16me128"))
                 {
                      rollno();
                 } 
                else 
                  {
                       System.out.println("Enter your correct regno please"); 
                       page1();
                   }
                 rollno();
                }catch(Exception j){}
          }
 
       public void rollno()
           {
              try
                {
               System.out.println("Enter the rollno please!");
               int rollno = Integer.parseInt(in.readLine());
               if(rollno==128)
                 {
                       System.out.println("your rollno is correct");         
                       System.out.println("Thanks for using "+brand);
                       age();    
                  }
                else
                   {
                        System.out.println("enter correct rollno please");
                        rollno();
                    }
                }catch(Exception u){}
              age();
               }
       
         public void age()
             {
                  try
                      {
                     System.out.println("Enter your age please!");
                     int age = Integer.parseInt(in.readLine());
                     if(age>18)
                        {
                             System.out.println("Sorry you are not eligible for out school because your above "+age);
                         }
                      else if((age<16)&&(age>=12))
                        {
                             System.out.println("You are eligible for higher secondary of our school "+name);
                         }          
                      else if((age<12)&&(age>6))
                         {
                             System.out.println("You are eligible for primary of our school "+name);   
                          } 
                       else
                          {
                                System.out.println("you are a child baby "+name);
                           }
                      }catch(Exception p){}
              }
    }

class second
   {
       public static void main(String[] args)
           { 
                one obj = new one("16me128",128);        
                 obj.name("vinith");
           }
    }