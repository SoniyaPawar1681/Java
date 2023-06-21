package Oops_Concept;
class home
{
	public home (int x)
	{
		System.out.println(x);
	}
	public home()
	{
		System.out.println("welcome");
	}
}
public class Para2 
{

	public static void main(String[] args)
	{
		home h1=new home(2);
        home h2=new home();
	}

}
