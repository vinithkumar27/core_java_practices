package practice1111;
import java.util.*;
class sortdelete
{
	Scanner in = new Scanner(System.in);
	sortdelete()
	{
	   System.out.println("enter size of array");
	   int size=in.nextInt();
	   if(size<0)
	   {
		   System.out.println("Invalid Input");
		   System.exit(0);
	   }
	   int[] x=new int[size];
	   System.out.println("enter array values");
	   for(int i=0;i<size;i++)
	   {
		   x[i]=in.nextInt();
		   if(x[i]<0)
		   {
			   System.out.println("Invalid Input");
			   System.exit(0);
		   }
	   }
	   //Arrays.sort(x);
	   System.out.println(Arrays.toString(x));
	   System.out.println("enter the value to delete");
	   int dele=in.nextInt();
	   for(int i=0;i<size;i++)
	   {
		   if(x[i]==dele)
		   {
			   for(int j=i;j<x.length-1;j++)
			   {
				   x[j]=x[j+1];
			   }
			   x[x.length-1]=0;
		   }
	   }
	   System.out.println(Arrays.toString(x));
	}
}
public class sortanddelete
{
	public static void main(String[] args)
	{
        sortdelete obj = new sortdelete();
	}
}
