package inheritance;
class company
{
	public void display()
	{
		System.out.println("company name is:Infosys");
	}
}
class employee extends company
{
	public void show()
	{
		System.out.println("emloyee name is:soniya");
	}
}
class project extends employee
{
	public void check() 
	{
		System.out.println("project name is:backery management system");
	}
}
public class first 
{

	public static void main(String[] args) 
	{
		project p1=new project();
		p1.display();
		p1.show();
		p1.check();
		

	}

}
