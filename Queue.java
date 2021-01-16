import java.io.*;
import java.util.Scanner;
public class Queue
{
	Scanner sc=new Scanner(System.in);
	int size,front,rear,data,arr[];
	Queue()
	{
		System.out.println("	OPERATIONS MENU");
		System.out.println("       __________________");
	}
	public Queue(int N)
	{
		size=N;
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	public void enqueue()
	{
		if(front>=0 && rear==size-1)
		{
			System.out.println("Insertion not possible due to overflow");
		}
		else
		{
			System.out.println("enter the element to be inserted:");
			data=sc.nextInt();
			if(rear==-1)
			{
				rear=0;
				front=0;
				arr[rear]=data;
			}
			else
			{
				rear++;
				arr[rear]=data;
			}
		}
	}
	public void dequeue()
	{
		if(front == -1)
		{
			System.out.println("deletion is not possible due to Underflow");
			System.exit(1);
		}
		else
		{
			System.out.println("The element deleted is "+arr[front]);
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{	
				front++;
			}
		}
	}
	public void display()
	{
		System.out.println("	queue");
		System.out.println("	______");
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
	public static void main(String args[])
	{
		System.out.print("Enter the size of queue:\n");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); 
		Queue ob=new Queue(n);
		Queue ob1=new Queue();
		char ch;
		do
		{
			System.out.println("Press 1 , 2 or 3 to select your choice");
			System.out.println("1.ENQUEUE[insert element]");
			System.out.println("2.DEQUEUE[remove element]");
			System.out.println("3.DISPLAY");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				{
					ob.enqueue();
				}
				break;
				case 2:
				{
					ob.dequeue();
				}
				break;
				case 3:
				{
					ob.display();
				}
				break;
				default :
				System.out.println("Wrong entry");
				break;
			}
			System.out.println("Do you want to continue?(Type 'y' if yes 'n' if no)");
			ch=s.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}
}
