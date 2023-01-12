

package m_project;
import java.util.Scanner;

public class LinkedList {
	Node  start;
	Scanner sc=new Scanner(System.in);
	void create()
	{
		Node p=new Node();
		System.out.println("Input node value");
		p.info=sc.nextInt();
		p.link=null;
		start=p;
		System.out.println("Do you want to more Nodes(1/0)");
		int op=sc.nextInt();
		while(op != 0)
		{
			Node q=new Node();
			System.out.println("Input Node Value");
			q.info=sc.nextInt();
			q.link=null;
			p.link=q;
			p=q;
			System.out.println("Do you want to add more nodes(1/0)");
			op=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println();
		System.out.println("Start= "+start);
		Node p=start;
		while(p!=null)
		{
			System.out.println(p.info+" "+p.link);
			p=p.link;
		}
	}
	int count()
	{
		int c=0;
		Node p=start;
		while(p!=null)
		{
			c++;
			p=p.link;
		}
		return c;
	}
	Node search(int ele)
	{
		Node p=start;
		while(p!=null)
		{
			if(p.info==ele)
				return p;
			p=p.link;
		}
		return null;
	}
	void insBeg()
	{
		Node p=new Node();
		System.out.println("Input node value");
		p.info=sc.nextInt();
		p.link=null;
	    p.link=start;
	    start=p;
		
	}
	void insEnd()
	{
		Node q=new Node();
		System.out.println("Input node value");
		q.info=sc.nextInt();
		q.link=null;
		if(start==null)
			start=q;
		else
		{
			Node p=start;
			while(q.link!=null)
			{
				p=p.link;
			}
			p.link=q;
		}
	}
	void insAny()
	{
		int c=count();
		System.out.println("Input Position");
		int pos=sc.nextInt();
		if(pos<1||pos>c+1)
		{
			System.out.println("Insertion Not Possible");
		}
		
		
		else if(pos==1)
				insBeg();
			else if(pos==c+1)
			    insEnd();
		   
		    else {
			    
			    	Node p=new Node();
			    	System.out.println("Input node value");
			    	p.info=sc.nextInt();
			    	p.link=null;
			    	
			    	int i=1;
			    			Node q=start;
			    			while(i<pos-1)
			    			{
			    				i++;
			    				q=q.link;
			    			}
			    			p.link=q.link;
			    			q.link=p;			    	
			    
		    }
		
		}
	int find2ndMax() {
	      Node p = start;
	      int max1 = p.info;
	      int max2 = max1;
	      while (p != null) {
	         if (p.info > max1) {
	            max2 = max1;
	            max1 = p.info;
	         }
	         p = p.link;
	      }
	      return max2;
	   }
	void remove(Node p) {
	      Node temp = start;
	      while (temp.link != null) {
	         if (p == p.link){
	            p.link = p.link;
	            break;
	         }
	         p = p.link;
	         
	      }
	   }
	
	void removeDuplicate() {
	      Node p = start;
	      outer: while (p != null) {
	         Node x = p.link;
	         Node y = p;
	         while (x != null) {
	            if (x.info == p.info){
	               remove(x);
	               continue outer;
	            }
	            y = x;
	            x = x.link;
	         }
	         p =p.link;
	      }
	   }
	int countUnique() {
	      Node p = start;
	      int count = 0;
	      outer: while (p != null) {
	         Node x = p.link;
	         while (x != null) {
	            if (x.info == p.info) {
	               p = p.link;
	               continue outer;
	            }
	            x = x.link;
	         }
	         count++;
	         p = p.link;
	      }
	      return count;
	   }
	

}
