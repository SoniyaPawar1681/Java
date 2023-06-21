package abstraction1;
abstract class calc
{
	abstract public void add();
	abstract public void sub();
	abstract public void mul();
	abstract public void div();
}
class stud extends calc
{
    public void add()
	{
	int a=10,b=20,c;
	c=a+b;
	System.out.println(c);
	}
    
    public void sub() 
	{
		int a=10,b=20,c;
		c=a-b;
		System.out.println(c);
		
	}

public void mul() 
	{
		int a=10,b=20,c;
		c=a*b;
		System.out.println(c);
		
	}
	public void div()
	{
		int a=10,b=20,c;
		c=a/b;
		System.out.println(c);
		
	}
	
}
public class first 
{

	public static void main(String[] args) 
	{
		stud s1=new stud();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();

	}

}
