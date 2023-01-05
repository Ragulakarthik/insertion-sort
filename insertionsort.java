import java.util.*;
import java.lang.*;
class insertionsort
{
	public static void sort(int []a,int l)
	{
		for(int i=1;i<l;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0&&a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;  
		}
	}
	public static void main(String args[])
	{
		int a[]={5,4,10,1,6,2};
		int l=a.length;
		sort(a,l);
		for(int i=0;i<l;i++)
		{
		System.out.println("hi");
	System.out.println(a[i]);
		}
	}
}
