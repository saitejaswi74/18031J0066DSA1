import java.util.Scanner;
import java.util.*;
class Equalpairs
{
	int a[];
	int n;
	
	public void sort(int a[],int n)
	{
		int c=0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=0)
			{
				if(a[i]==a[i+1])
				{
					a[i]=0;
					c++;
				}
				
			}
		}
		System.out.println("No.of count of pairs is:"+c);
	}
}

public class Main 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Equalpairs s=new Equalpairs();
		s.sort(a, n);
		
	}

}
