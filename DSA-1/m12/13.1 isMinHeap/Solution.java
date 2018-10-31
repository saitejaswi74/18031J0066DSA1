
import java.util.Scanner;

class Heap
{
	boolean Min_heap(int i,String s[])
	{
		int n=s.length-1;
		while(2*i<n)
		{
			int j=2*i;
			if(j<n && less(s,j+1,j))
			{
				j++;
			}
			if(!less(s,i,j))
			{
				return false;
			}
			else
			{
				i=j;
			}
		}
		
		return true;
	}
	boolean Min_num(int i,Double d[])
	{
		int n=d.length-1;
		while(2*i<n)
		{
			int j=2*i;
			if(j<n && less1(d,j+1,j))
			{
				j++;
			}
			if(!less1(d,i,j))
			{
				return false;
			}
			else
			{
				i=j;
			}
		}
		
		return true;
	}
	boolean less1(Double d[],int j,int i)
	{
		return d[j]<=d[i];
	}

	boolean less(String[] s, int j, int i) 
	{
		return s[j].compareTo(s[i])<=0;
	}
}
public class Solution 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s)
		{
			case "String":
				int n=sc.nextInt();
				String s1[]=new String[n];
				String a=sc.nextLine();
				for(int i=0;i<s1.length;i++)
				{
					String s2=sc.next();
					String s3[]=null;
					s3=s2.split(",");
					Heap h=new Heap();
					System.out.println(h.Min_heap(1, s3));
					
				}
				break;
			case "Float":
				int n1=sc.nextInt();
				String[] z=new String[n1];
				String z1=sc.nextLine();
				
				for(int i=0;i<z.length;i++)
				{
					String z2=sc.next();
					String z3[]=null;
					z3=z2.split(",");
					Double[] d=new Double[z3.length+1];
					for(int l=0;l<=z3.length-1;l++)
					{
						//String z4=z3[l];
						d[l]=Double.parseDouble(z3[l]);
					}
					Heap h=new Heap();
					System.out.println(h.Min_num(1, d));
				}
				break;
			case "Double":
				int n2=sc.nextInt();
				String[] y=new String[n2];
				String y1=sc.nextLine();
				
				for(int i=0;i<y.length;i++)
				{
					String y2=sc.next();
					String y3[]=null;
					y3=y2.split(",");
					Double[] d=new Double[y3.length+1];
					for(int l=1;l<=y3.length;l++)
					{
						//String z4=z3[l];
						d[l]=Double.parseDouble(y3[l-1]);
					}
					Heap h=new Heap();
					System.out.println(h.Min_num(1, d));
				}
				break;
			case "Integer":
				int n3=sc.nextInt();
				String[] x=new String[n3];
				String x1=sc.nextLine();
				
				for(int i=0;i<x.length;i++)
				{
					String x2=sc.next();
					String x3[]=null;
					x3=x2.split(",");
					Double[] d=new Double[x3.length+1];
					for(int l=1;l<=x3.length;l++)
					{
						//String z4=z3[l];
						d[l]=Double.parseDouble(x3[l-1]);
					}
					Heap h=new Heap();
					System.out.println(h.Min_num(1, d));
				}
				break;
		}
	}
}
