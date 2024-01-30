package doubts;

public class thisConsEx3 {
	int a,b;
	thisConsEx3()
	{
	this(10,20);
	System.out.println("zero arguement");
	}
	thisConsEx3(int x)
	{
	this();
	
	System.out.println("one arguement");
	}
	thisConsEx3(int x,int y)
	{
	System.out.println("two arguement");
	display(x,y);
	}
	void display(int x,int y)
	{
	a=x;
	b=y;
	System.out.println("a+b : "+(a+b));
	}
	public static void main(String args[])
	{
	thisConsEx3 obj1=new thisConsEx3(10);}
	
}
