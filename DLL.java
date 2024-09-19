import java.util.*;
class Node
{
	int data;
	Node next,prev;	
	
	Node(int x)
	{
		data=x;
		prev=null;
		next=null;
	}
}
class Doublelist
{
	Node head,tail;
	Doublelist()
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
			n.prev=tail;
			tail=n;
		}
	}
	void rshow()//next or forward traversing
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
	void lshow()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.prev;
		}
	}
}
class DLL
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Doublelist d1=new Doublelist();
		for(;;)
		{
			System.out.println();
			System.out.println("1.create\n2.print\n3.exit");
			System.out.println("enter your choice");
			int ch=s.nextInt();
			if(ch==1)
			{
				System.out.println("enter an element");
				int x=s.nextInt();
				d1.create(x);
			}
			else if(ch==2)
			{
				System.out.println("which way to traverse\n1.forward\n2.backward");
				int r=s.nextInt();
				if(r==1)
					d1.rshow();
				else if(r==2)
					d1.lshow();
				else
					System.out.println("invalid choice");
			}
			else if(ch==3)
			{
				break;
			}
			else
			{
				System.out.println("wrong choice");
			}
		}
	}
}

/*ouput:
1.create
2.print
3.exit
enter your choice
1
enter an element
10

1.create
2.print
3.exit
enter your choice
1
enter an element
20

1.create
2.print
3.exit
enter your choice
30
wrong choice

1.create
2.print
3.exit
enter your choice
1
enter an element
40
1.create
2.print
3.exit
enter your choice
1
enter an element
50

1.create
2.print
3.exit
enter your choice
2
which way to traverse
1.forward
2.backward
1
10
20
40
50

1.create
2.print
3.exit
enter your choice
2
which way to traverse
1.forward
2.backward
2
50
40
20
10

1.create
2.print
3.exit
enter your choice
3
*/
		



			
	
                                                                                                                                                 