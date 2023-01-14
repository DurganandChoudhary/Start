package Linked_Linear_Q;

public class Linked_Queue 
{
	Node front;
	Node rear;
	
	void insert(int ele)
	{
		Node p=new Node();
		p.info=ele;
		p.link=null;
		
		if(front == null && rear == null)
		front=rear=p;
		else
		{
			rear.link=p;
			rear=p;
		}
	}
	void delete()
	{
		if(front==null&&rear==null)
		{
			System.out.println("Underflow");
			return;
		}
		else if(front==rear)
			front=rear=null;
		else
		{
			Node p=front;
			front=front.link;
			p.link=null;
		}
	}
	void display()
	{
		Node p=front;
		while(p!=null)
		{
			System.out.println(p.info+" "+p.link);
			p=p.link;
		}
	}
}
