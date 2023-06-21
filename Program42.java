package excepion_handling1;

public class throw_keyword 
{

	public static void main(String[] args) 
	{
		int num=0;
		if(num>=0)
		{
		System.out.println("Number is positive");
		}
		else
		{
			throw new ArithmeticException("Number is negative");
		}

	}

}
