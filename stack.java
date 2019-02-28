import java.util.*;
class node
{
	int data;
	node next;
	node head=null;
	public node(int data1)
	{
		this.data=data1;
		this.next=null;
	}
	public node push(int data)
	{ 
		node l=new node(data);
		if(head==null)
		{
               head=l;
		}
		else
		{
	    l.next=head;
	    head=l;
	     }
	     return head;
	}
	public node pop(node temp)
	{
          temp=head;
          head=head.next;
          return head;
	}

	public void printlist(node head)
	{
		node temp=head;
		while(temp!=null)
		{
         System.out.println(temp.data+"");
         temp=temp.next;
		}
	}
}
class main
{
	public static void main(String[]args)
	{
		
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         
         int data=0;
         node h=null;
         node p=new node(data);
        
 
  for(int i=0;i<n;i++)
  {
  	data=s.nextInt();
  	h=p.push(data);
  }
 node m=p.pop(h);
System.out.println("linked list:");
p.printlist(m);
m=p.pop(h);
p.printlist(m);



	}
}