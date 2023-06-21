package First;
class Even
{
	int a;
	
	public void check()
	{
		a=17;
		if(a%2==0)
		{
			System.out.println("even");
			
		}
		else
		{
			System.out.println("odd");
		}
		
	}
	
}
public class third {

	public static void main(String[] args)
	{
		Even e1=new Even();
		e1.check();

	}

}
