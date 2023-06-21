package excepion_handling1;

public class array 
{

	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
		    a[0]=23;
            a[1]=43;
            a[2]=12;
            a[3]=89;
            a[4]=67;
            System.out.println(a[7]);
		}
		catch(Exception e)
		{
		 System.out.println("ArrayIndexOutOfBoundsException");	
		}
	}

}
