package LinearQ;

public class L_Queue_Array {
	int f,r;
	final int MAX=5;
	int que[];
	
	L_Queue_Array ()
	{
		f=r=-1;
		que=new int[MAX];
		
	}
	void insert(int ele)
	{
		if(r==MAX-1)
		{
			System.out.println("Overflow");
		}
		else if(f==-1 && r==-1)
			f=r=0;
		else
			r++;
		que[r]=ele;
	}
	void delete()
	{
		if(f==-1 && r==-1)
			System.out.println("Underflow");
		else if(f==r)
			f=r=-1;
		else
			f++;
	}
	void display()
	{
		for(int i=f; i<=r;i++)
		{
			System.out.println(que[i]);
		}
	}
	

}
