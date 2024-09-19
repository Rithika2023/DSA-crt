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
	}
	void insertFirst(int x)
	{
		Node n=new Node(x);
		if(head==null)
			head=tail=n;
		else
		{
			n.next=head;
			head=n;
		}
	}
	void insertPosition(int x,int pos)
	{
		Node n=new Node(x);
		if(head==null)
			head=tail=n;
		else
		{
			Node temp=head;
			int count=2;
			while(count<pos && temp.next!=null)
			{
				count++;
				temp=temp.next;
			}
			if(temp.next==null)
			{
				temp.next=n;
				tail=n;
			}
			else
			{
				n.next=temp.next;
				temp.next=n;
			}
		}
	}
	void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		System.out.println(head.data+"is deleted");
	}
	void deleteLast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node temp=head;
		if(temp.next==null)
		{
			System.out.println(temp.data+"is deleted");
			head=tail=null;
			return;
		}
		while(temp.next.next!=null)
			System.out.println(temp.next.data+"is deleted");
			temp.next=null;
			tail=temp;
	}
	void deletePosition(int pos)
	{
		if(head==null)
		{
			System.out.println("lkist is empty");
			return;
		}
		Node temp=head;
		int count=2;
		if(temp.next==null)
		{
			System.out.println(temp.data+"is deleted");
			head=tail=null;
			return;
		}
		while(count<pos && temp.next.next!=null)
		{
			count++;
			temp=temp.next;
		}
		if(temp.next.next==null)
		{
			System.out.println(temp.next.data+"is deleted");
			temp.next=null;
			tail=temp;
		}
		else
		{
			System.out.println(temp.next.data+"is deleted");
			Node temp1=temp.next;
			temp.next=temp.next.next;
			temp1.next=null;
		}
	}
}
class Allsll
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	SingleList s1=new SingleList();
	for(;;)
	{
		System.out.println();
		System.out.println("1.create\n2.Print\n3.Insert first\n4.insert any position\n5.delete first\n6.delete last\n7.delete at any position\n8.exit");
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
		{
			int x;
			System.out.println("enter an element");
			x=s.nextInt();
			s1.insertFirst(x);			
		}
		else if(ch==4)
		{
			int x,pos;
			System.out.println("enter element and position");
			x=s.nextInt();
			pos=s.nextInt();
			s1.insertPosition(x,pos);
		}
		else if(ch==5)
		{
			s1.deleteFirst();
		}
		else if(ch==6)
		{
			s1.deleteLast();
		}
		else if(ch==7)
		{
			int pos;
			System.out.println("enter position");
			pos=s.nextInt();
			s1.deletePosition(pos);
		}
		else if(ch==8)
		{
			break;
		}
		else
			System.out.println("Invalid choice");
	}
}
}





/*output:
1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
1
enter an element
11

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
1
enter an element
22

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
1
enter an element
33

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
1
enter an element
44

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
2
11
22
33
44

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
3
enter an element
10

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
2
10
11
22
33
44

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
3
enter an element
10

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
2
10
10
11
22
33
44

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
4
enter element and position
12 4

1.create
2.Print
3.Insert first
4.insert any position
5.delete first
6.delete last
7.delete at any position
8.exit
enter your choice
2
10
10
11
12
22
33
44*/