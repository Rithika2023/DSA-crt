import java.util.Scanner;
class MyQueue{
	int a[];
	int size;
	int rear,front;
	
	MyQueue(int n)
	{
		front=-1;
		rear=-1;
		size=n;
		a=new int [n];
	}
	void enQueue(int x)
	{
		if(rear==size-1)
		{
			System.out.println("queue is full");
			return;
		}dc          c ddddddd
		rear++;
		a[rear]=x;
	}
	void deQueue()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
			return;
		}
		front++;
		System.out.println(a[rear]+" is deleted");
	}
	void display()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
			return;
		}
		for(int i=front+1;i<=rear;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
class AllQueueArray
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of queue");
		int n=s.nextInt();
		MyQueue s1=new MyQueue(n);
		for(;;)
		{
			System.out.println();
			System.out.println("1.enQueue\n2.deQueue\n3.print\n4.exit");
			System.out.println("enter your choice");
			int ch=s.nextInt();
			if(ch==1)
			{
				System.out.println("enter an element");
				int x=s.nextInt();
				s1.enQueue(x);
			}
			else if(ch==2)
			{
				s1.deQueue();
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

enter the size of queue
5

1.enQueue
2.deQueue
3.print
4.exit
enter your choice
1
enter an element
10

1.enQueue
2.deQueue
3.print
4.exit
enter your choice
1
enter an element
20

1.enQueue
2.deQueue
3.print
4.exit
enter your choice
1
enter an element
30

1.enQueue
2.deQueue
3.print
4.exit
enter your choice
2
30 is deleted

1.enQueue
2.deQueue
3.print
4.exit
enter your choice
3
20
30

1.enQueue
2.deQueue
3.print
4.exit
enter your choice
4*/

