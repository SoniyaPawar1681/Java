package even;

public class first 
{

	public static void main(String[] args)
	{
		int i,sum=0;
		for(i=1;i<50;i++)
		{
		  if(i%2==0)
		  {
			System.out.println(i);
			sum=sum+i;
		  }
		  
		}
		System.out.println("sum of even no is"+sum);
	}

}
