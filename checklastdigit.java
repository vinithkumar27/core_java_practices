package practice1111;
import java.util.*;
class lastdigit
{
	Scanner in = new Scanner(System.in);
   public void first()
   {
	   int count=0;
	   System.out.println("enter no of elements");
	   int size=in.nextInt();
	   int[] x=new int[size];
	   System.out.println("enter the "+size+" elements");
	   for(int i=0;i<size;i++)
	   {
		   x[i]=in.nextInt();
		   if(x[i]%10==3)
		   {
			  count++; 
		   }
	   }
	   System.out.println("no. of last digits with 3 is :"+count);
   }
}


public class checklastdigit {

	public static void main(String[] args) 
	{
       lastdigit obj=new lastdigit();
       obj.first();
	}

}
