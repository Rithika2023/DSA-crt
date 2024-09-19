import java.util.*;
class Node
{
	int data;
	Node next,prev,left;	
	
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
	void insertAtFirst(int x)
	{
		Node n=new Node(x);
		if(head==null)
		{
			head=tail=n;
		}
		else
		{
			head.prev=n;
			n.next=head;
			head=n;
		}
	}
	void insertAtSpecified(int x,int pos)
	{
		Node n=new Node(x);
		if(head==null)
		{
			head=tail=n;
		}
		else
		{
			Node temp=head;
			int count=1;
			while(count<pos && temp.next!=null)
			{
				count=count+1;
				temp=temp.next;
			}
			if(temp.next==null)
			{
				temp.next=n;
				n.left=temp;
				tail=n;
			}
			else
			{
				n.next=temp;
				n.prev=temp.prev;
				temp.prev.next=n;
				temp.prev=n;
			} 
		}
	}
	void deleteAtFirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		if(head.next==null)
		{
			head=tail=null;
		}
		else
		{
			Node temp=head;
			head=head.next;
			head.prev=null;
			temp=null;
		}
	}
	void deleteAtLast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		if(tail.prev==null)
		{
			head=tail=null;
		}
		else
		{
			Node temp=tail;
			tail=tail.prev;
			tail.next=null;
			temp=null;
		}
	}
	void deleteAtSpecified(int pos)
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		int count=1;
		Node temp=head;
		while(count<pos && temp.next!=null)
		{
			count=count+1;
			temp=temp.next;
		}
		if(temp.next==null)
		{
			temp.prev.next=null;
			tail=temp.prev;
			temp=null;
		}
		else
		{
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
			temp=null;
		}
	}
				
}
class DLLfull
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Doublelist d1=new Doublelist();
		for(;;)
		{
			System.out.println();
			System.out.println("1.create\n2.print\n3.insertatfirst\n4.inseratspecified\n5.deleteatfirst\n6.deleteatlast\n7.deleteatlspecified\n8.exit");
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
				System.out.println("enter an element");
				int x=s.nextInt();
				d1.insertAtFirst(x);
			}
			else if(ch==4)
			{
				System.out.println("enter an element and position");
				int x=s.nextInt();
				int pos=s.nextInt();
				d1.insertAtSpecified(x,pos);
			}
			else if(ch==5)
			{
				d1.deleteAtFirst();
			}
			else if(ch==6)
			{
				d1.deleteAtLast();
			}
			else if(ch==7)
			{
				System.out.println("enter position");
				int pos=s.nextInt();
				d1.deleteAtSpecified(pos);
			}
			else if(ch==8)
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



/*output:


1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
1
enter an element
10

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
1
enter an element
20

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
1
enter an element
30

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
3
enter an element
40

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
2
which way to traverse
1.forward
2.backward
1
40
10
20
30

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
4
enter an element and position
50 2

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
2
which way to traverse
1.forward
2.backward
1
40
50
10
20
30

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
5

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
2
which way to traverse
1.forward
2.backward
1
50
10
20
30

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
6

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
2
which way to traverse
1.forward
2.backward
1
50
10
20

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
7
enter position
2

1.create
2.print
3.insertatfirst
4.inseratspecified
5.deleteatfirst
6.deleteatlast
7.deleteatspecified
8.exit
enter your choice
2
which way to traverse
1.forward
2.backward
1
50
20
