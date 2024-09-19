import java.util.Scanner;
class Node{
	int data;
	Node next;
	
	Node(int x)
	{
		data=x;
		next=null;		
	}
}
class MyStack
{
	Node head;
	MyStack()
	{
		head=null;
	}
	void push(int x)
	{
		Node n=new Node(x);
		if(n==null)
		{
			System.out.println("stack is overflow");
			return;
		}
		if(head==null)
			head=n;
		else
		{
			n.next=head;
			head=n;
		}
	}
	void pop()
	{
		if(head==null)
		{
			System.out.println("stack is underflow");
			return;
		}
		System.out.println(head.data+"is deleted");
		head=head.next;
	}
	void display()
	{
		if(head==null)
		{
			System.out.println("stack is empty");
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
class AllStackLL
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		MyStack s1=new MyStack();
		for(;;)
		{
			System.out.println();
			System.out.println("1.push\n2.pop\n3.print\n4.exit");
			System.out.println("enter your choice");
			int ch=s.nextInt();
			if(ch==1)
			{
				System.out.println("enter an element");
				int x=s.nextInt();
				s1.push(x);
			}
			else if(ch==2)
			{
				s1.pop();
			}
			else if(ch==3)
			{
				s1.display();
			}
			else if(ch==4)
			{
				break;
			}
			else
			{
				System.out.println("invalid choice");
			}
		}
	}
}

/*output:

1.push
2.pop
3.print
4.exit
enter your choice
1
enter an element
10

1.push
2.pop
3.print
4.exit
enter your choice
1
enter an element
20

1.push
2.pop
3.print
4.exit
enter your choice
1
enter an element
30

1.push
2.pop
3.print
4.exit
enter your choice
1
enter an element
40

1.push
2.pop
3.print
4.exit
enter your choice
1
enter an element
50

1.push
2.pop
3.print
4.exit
enter your choice
3
50
40
30
20
10

1.push
2.pop
3.print
4.exit
enter your choice
2
50is deleted

1.push
2.pop
3.print
4.exit
enter your choice
3
40
30
20
10

1.push
2.pop
3.print
4.exit
enter your choice
4*/
