package excepion_handling1;

public class throw1 
{

	public static void main(String[] args)
	{
		int num=10;
		if(num>=0)
		{
		throw new ArithmeticException("Number is positive");
		}
		else
		{
		System.out.println("Number is negative");
		}
		

	}

}
