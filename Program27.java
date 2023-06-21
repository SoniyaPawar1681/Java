package First;
class Calculate
{
	int a,b,c;
	
	public void add()
	{
		a=20;
		b=10;
		c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println(c);
	}
	public void mul()
	{
		c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		c=a/b;
		System.out.println(c);
	}
	
}
public class Home 
{

	public static void main(String[] args) 
	{
		Calculate c1=new Calculate();
				c1.add();
				c1.sub();
				c1.mul();
				c1.div();
	}

}
