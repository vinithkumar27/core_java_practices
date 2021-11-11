package practice1111;
import java.util.*;
class mincheck
{
	Scanner in = new Scanner(System.in);
	public void checker()
	{
		int temp;
	   System.out.println("enter the no of elements in first array");
	   int size=in.nextInt();
	   int[]x=new int[size];
	   System.out.println("enter elements in first array");
	   for(int i=0;i<size;i++)
	   {
		   x[i]=in.nextInt();
	   }
	   System.out.println("enter the no of elements in second array");
	   int size1=in.nextInt();
	   int[]y=new int[size1];
	   System.out.println("enter elements in second array");
	   for(int i=0;i<size;i++)
	   {
		   y[i]=in.nextInt();
	   }
	   for(int i=0;i<size;i++)
	   {
		   for(int j=i+1;j<size;j++)
		   {
			if(x[i]>x[j])
			{
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		   }
	   }
	   System.out.println(Arrays.toString(x));
	   System.out.println("smallest one in array one "+x[0]);
	   for(int i=0;i<size;i++)
	   {
		   for(int j=i+1;j<size;j++)
		   {
			if(y[i]>y[j])
			{
				temp=x[i];
				y[i]=y[j];
				y[j]=temp;
			}
		   }
	   }
	   System.out.println(Arrays.toString(y));
	   System.out.println("smallest one in array two "+y[0]);
	   if(x[0]==y[0])
	   {
		   Arrays.sort(y);
		   System.out.println("The addition of smallest one is "+(x[0]+y[1]));
	   }
	   else
	   {
		   System.out.println("The addition of smallest one is "+(x[0]+y[0]));
	   }
	}
}
public class addtwoarraymin
{
	public static void main(String[] args)
	{
        mincheck obj =new mincheck();
        obj.checker();
	}

}
