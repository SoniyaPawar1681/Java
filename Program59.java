package polymophism1;
class home
{
	public void get(int x,int y)
	{
		System.out.println(x);
		System.out.println(y);
	}
	public void get(float x)
	{
		System.out.println(x);
	}
}
public class method_overloading 
{

	public static void main(String[] args) 
	{
	  home h1=new home();
		h1.get(2, 3);	  
        h1.get(2.4f);
	}

}
