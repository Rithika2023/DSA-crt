import java.util.Scanner;
class MyStack{
	int a[];
	int size;
	int top;
	
	MyStack(int n)
	{
		top=-1;
		size=n;
		a=new int [n];
	}
	void push(int x)
	{
		if(top==size-1)
		{
			System.out.println("stack is overflow");
			return;
		}
		top++;
		a[top]=x;
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("stack is underflow");
			return;
		}
		System.out.println(a[top]+"is deleted");
		top--;
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
	}
}
class AllStackArray
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of stack");
		int n=s.nextInt();
		MyStack s1=new MyStack(n);
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
enter the size of stack
5

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
2
20is deleted

1.push
2.pop
3.print
4.exit
enter your choice
2
stack is underflow

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
1
enter an element
60

1.push
2.pop
3.print
4.exit
enter your choice
3
60
50
40
30
20

1.push
2.pop
3.print
4.exit
enter your choice
1
enter an element
70
stack is overflow

1.push
2.pop
3.print
4.exit
enter your choice
2
60is deleted

1.push
2.pop
3.print
4.exit
enter your choice
4*/
	





			
