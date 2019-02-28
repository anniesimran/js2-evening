import java.util.*;
class stack1
{      

	
	static void push(int n, int[] a)
	{     Scanner s=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			//a[i]=s.nextInt();
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void pop(int n,int[] a)
	{
		while(n!=0)
		{
			System.out.println("pop element is: "+a[n-1]);
            n--;
            push(n,a);
		}					
	}
	public static void main(String[]args)
	{
	    Scanner s=new Scanner(System.in);	
		int n=s.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		push(n,a);
		pop(n,a);
	}
}