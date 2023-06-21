package method_overriding;
class collage
{
	public void disc()
	{
		System.out.println("Welcome");
	}
}
class Student extends collage
{
	public void disc()
	{
		super.disc();
		System.out.println("Hello");
	}
}
public class First 
{

	public static void main(String[] args) 
	{
		collage c1=new collage();
		c1.disc();
        
	}

}
