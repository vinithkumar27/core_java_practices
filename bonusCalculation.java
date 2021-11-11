package practice1111;
import java.util.*;
class bonus
{
	Scanner in = new Scanner(System.in);
	static int bonus=0;
	bonus()
	{
		System.out.println("enter your basic salary");
		int basic=in.nextInt();
		
		if(basic<0)
		{
			System.out.println("number too small");
		}
		else if(basic>32767)
		{
		System.out.println("number too large");	
		}
		else
		{
			bonus=calculateBonus(basic);
			System.out.println("bonus ="+bonus);
		}
	}
	public static int calculateBonus(int basic)
	{
		if(basic>20000)
		{
			bonus=(int)(basic*0.17)+1500;
			return bonus;
		}
		else if(basic>15000)
		{
		     bonus=(int)(basic*0.15)+1200;
		     return bonus;
		}
		else if(basic>10000)
		{
			bonus=(int)(basic*0.12)+1000;
			return bonus;
		}
		else
		{
			bonus=(int)(basic*0.08)+500;
			return bonus;
		}
	}
}

public class bonusCalculation 
{
   public static void main(String[]args)
   {
	   bonus obj = new bonus();
   }
}
