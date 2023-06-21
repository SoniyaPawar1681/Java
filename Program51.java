package constructor;
class sample
{
	int id;
	String name;
	sample(int i,String n)
	{
		id=i;
		name=n;
	}
	sample(sample s)
	{
		id=s.id;
		name=s.name;
	}
	void show()
	{
		System.out.println("id=" +id);
		System.out.println("name=" +name);
	}
}


public class copy 
{

	public static void main(String[] args) 
	{
		sample m1=new sample(101,"abc");
		m1.show();
		
		sample m2=new sample(m1);
		m2.show();

	}

}
