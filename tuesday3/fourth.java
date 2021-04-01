import java.util.Random;     // import 
class one                              // class name of one
    {
           static char[] generateOTP(int length)     //method 
              {
                  String numbers = "1234567890";     //declare string
                  Random random = new Random();   //object creation to import
                  char[] otp = new char[length];          //array declaration and creation
                  for(int i = 0; i< length ; i++)               //for looping process
                     {
                         otp[i] = numbers.charAt(random.nextInt(numbers.length()));
                     } 
                       return otp;
                }
           public void out()
                 {
                     System.out.println(generateOTP(4));
                  }
     }

public class fourth
    {
   public static void main(String[] args) 
       {
            one obj1 = new one();
            obj1.generateOTP(4);
            obj1.out();	
        }
     }