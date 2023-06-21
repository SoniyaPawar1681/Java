package excepion_handling1;
class Ram
{
	public void get(int x,int y)throws ArithmeticException
	{
		int z=x/y;
		System.out.println(z);
	}
}
public class throws_keyword 
{

	public static void main(String[] args)
	{
		Ram r1=new Ram();
		try
		{
			r1.get(20,0);
		}
		catch(Exception e)
		{
			System.out.println("Exception handling");
		}

	}

}
