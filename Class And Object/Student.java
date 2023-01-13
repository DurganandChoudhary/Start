package Q10;

public class Student {
	String name;
	int roll;
	double mark;
	
	void setData(String name,int roll,double mark)
			{
		this.name=name;
		this.roll=roll;
		this.mark=mark;
			}
	void display()
	{
		System.out.println(name+" "+roll+" "+mark);
	}

}
