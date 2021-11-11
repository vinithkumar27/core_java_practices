package practice1111;
import java.util.*;
public class secondLargest
{
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args)
	{
		 System.out.println("enter no of numbers");
		 int size=in.nextInt();
		 int temp;
		 if(size<0)
		 {
			 System.out.println("invalid input");
			 System.exit(0);
		 }
		 int[] x=new int[size];
		 for(int i=0;i<size;i++)
		 {
			x[i]=in.nextInt(); 
			if(x[i]<0)
			{
				System.out.println("invalid input");
				System.exit(0);
			}
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
		 for(int i=0;i<size;i++)
		 {
		 System.out.println(x[i]);
		 }
		 System.out.println(Arrays.toString(x));
		 System.out.println("The product is "+x[0]*x[x.length-2]);
	}

}
