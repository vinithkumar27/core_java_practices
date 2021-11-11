package practice1111;
import java.util.*;

		class bike
		{
			
		  public int findMileage(int cc)
		  {
			  
			  int mileage=0;
			  if((cc>=100)&&(cc<=125))
			  {
				  return 75;
			  }
			  else if((cc>=126)&&(cc<=135))
			  {
				  return 70;
			  }
			  else if((cc>=136)&&(cc<=150))
			  {
				  return 60;
			  }
			  else if((cc>=151)&&(cc<=200))
			  {
				  return 50;
			  }
			  else if((cc>=201)&&(cc<=220))
			  {
				  return 35;
			  }
			  else if(cc>220)
			  {
				  return -1;
				  System.out.println("Number too large");
			  }
			  else if(cc<100)
			  {
				  return -2;
				  System.out.println("Number too small");
			  }
			  System.out.println("The milage is "+mileage);
		  }
		}
		public class bikemilage2
		{
			public static void main(String[] args) 
			{
				Scanner in = new Scanner(System.in);
		        bike obj = new bike();
		        System.out.println("enter your bike cc");
		  	    int cc=in.nextInt();
		        //find mileage
		        obj.findMileage(cc);
		  	  System.out.println("The milage is "+findMileage(cc));
			}

		}

	}

}
