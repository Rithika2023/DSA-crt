//create a single llinked list 
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
class Singlelist
{
	Node head,tail;
	Singlelist()
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
			System.out.println("list is empty");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
}
class Singlell
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Singlelist s1=new Singlelist();
		for(;;)
		{
			System.out.println();
			System.out.println("1.create\n2.print\n3.exit");
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
				System.out.println("invalid choice");
		}
	}
}

/*output
1.create
2.print
3.exit
enter your choice
1
enter an element
23

1.create
2.print
3.exit
enter your choice
1
enter an element
24

1.create
2.print
3.exit
enter your choice
2
23
24

1.create
2.print
3.exit
enter your choice
3*/



			
			
			

			