package Oops_Concept;
class sky
{
	int id;
	String name;
	public sky(int i,String n)
	{
		id=i;
		name=n;
	}
	public void show()
	{
		System.out.println("Id="+id);
		System.out.println("Name="+name);
	}
}
public class Para3 
{

	public static void main(String[] args) 
	{
		sky s1=new sky(101,"Soniya");
        s1.show();
	}

}
