package Polymorphism;
class sky
{
	public void get(int x,int y)
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public void get(int x)
	{
		System.out.println(x);
	}
	public void get()
	{
		
	}
}
public class Home
{

	public static void main(String[] args) 
	{
		sky s1=new sky();
		s1.get(2,3);
		s1.get(4);
		s1.get();
	}

}
