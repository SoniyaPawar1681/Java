package inheritance;
class hospital
{
	public void display()
	{
		System.out.println("hospital name is:Bharati hospital");
	}
}
class doctor extends hospital
{
	public void show()
	{
		System.out.println("doctor name is:dr.priyanka");
	}
}
class patient extends doctor
{
	public void check() 
	{
		System.out.println("patient name is:abc");
	}
}
public class second 
{

	public static void main(String[] args) 
	{
		patient e1=new patient();
		e1.display();
		e1.show();
		e1.check();

	}

}
