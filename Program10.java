package Array;

public class First 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		a[0]=23;
		a[2]=34;
		a[3]=45;
		a[4]=56;
		
		int c=a[1+1]+a[2+1];
		System.out.println(c);
	}

}
