package demo;
class cal
{
	int a,b,c;
	public void add()
	{
	  a=10;
	  b=20;
	  c=a+b;
	  System.out.println(c);
	}
	
	public void mul()
	{
		a=10;
		b=20;
		c=a*b;
		System.out.println(c);
		
	}
	public void sub()
	{
		a=10;
		b=20;
		c=a-b;
		System.out.println(c);
	}
}
public class Second {

	public static void main(String[] args) 
	{
		cal c1=new cal();
		c1.add();

	}

}
