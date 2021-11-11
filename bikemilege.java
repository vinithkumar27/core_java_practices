package practice1111;
import java.util.*;
class bike
{
	Scanner in = new Scanner(System.in);
  bike()
  {
	  System.out.println("enter your bike cc");
	  int cc=in.nextInt();
	  int mileage=0;
	  if((cc>=100)&&(cc<=125))
	  {
		  mileage=75;
	  }
	  else if((cc>=126)&&(cc<=135))
	  {
		  mileage=70;
	  }
	  else if((cc>=136)&&(cc<=150))
	  {
		  mileage=60;
	  }
	  else if((cc>=151)&&(cc<=200))
	  {
		  mileage=50;
	  }
	  else if((cc>=201)&&(cc<=220))
	  {
		  mileage=35;
	  }
	  else if(cc>220)
	  {
		  System.out.println("Number too large");
	  }
	  else if(cc<100)
	  {
		  System.out.println("Number too small");
	  }
	  else
	  {
		  System.out.println("enter integer value");
	  }
	  System.out.println("The milage is "+mileage);
  }
}
public class bikemilege
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        bike obj = new bike();
	}

}
