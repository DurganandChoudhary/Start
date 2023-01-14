package Circular_Queue;

public class C_Queue {
	int f,r;
	final int MAX=5;
	int que[];
	
	C_Queue()
	{
		f=r=-1;
		que=new int[MAX];
	}
	void insert(int ele)
	{
		if((f==0 && r==MAX-1)||(f==r+1))
		{
			System.out.println("Overflow");
			return;
		}
		else if(f==-1 && r==-1)
			f=r=0;
		else
			r=(r+1)%MAX;
		que[r]=ele;
	}
	void delete()
	{
		if((f==-1)&&(r==-1))
		{
			System.out.println("Underflow");
			return;
			
		}
		else if(f==r)
			f=r=-1;
		
		else
			f=(f+1)%MAX;
		
	}
	/*void display()
	{
		System.out.println("Front="+f+" Rear= "+r);
		if(f<r)
		{
			for(int i=f;i<=r;i++)
			System.out.print(que[i]+" ");
			for(int i=0;i<=r;i++)
				
				System.out.print(que[i]+" ");
		}
		System.out.println();
		*/
	void display()
	{
		System.out.println("Front :"+f);
		System.out.println("Rear :"+r);
		if(f<r) {
			for(int i=f; i<=r; i++)
			{
				System.out.println(que[i]+" ");
			}
		}
		else
		{
			for(int i=f; i<MAX; i++)
			{
				System.out.println(que[i]+" ");
			}
			for(int i=0; i<=r; i++)
			{
				System.out.println(que[i]+" ");
			}
		}
	}

}
