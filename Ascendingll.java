import java.util.*;
class Node
{
	int data;
	Node next;
	
	Node(int x)
	{
		data=x;
		next=null;
	}
}
class SingleList
{
	Node head,tail;
	SingleList()
	{
		head=tail=null;
	}
	void create(int x)
	{
		Node n=new Node(x);
		if(head==null)
		{
			head=tail=n;
		}
		else
		{
			tail.next=n;
			tail=n;
		}
	}
	void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		if(head==null)
		{
			head=tail=n;
			return;
		}
		if(x<head.data)
		{
			n.next=head;
			head=n;
		}
		Node temp=head;
		n.next=temp.next;
	}
}
class Unique
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	SingleList s1=new SingleList();
	for(;;)
	{
		System.out.println();
		System.out.println("1.create\n2.Print\n3.exit");
		System.out.println("enter your choice");
		int ch=s.nextInt();
		if(ch==1)
		{
			int x;
			System.out.println("enter an element");
			x=s.nextInt();
			s1.create(x);
		}
		else if(ch==2)
		{
			s1.display();
		}
		else if(ch==3)
			break;
		else
			System.out.println("Invalid choice");
	}
}
}