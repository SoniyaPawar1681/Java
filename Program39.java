package encapsulaion1;
class company
{
	public String companyname="tcs";
	public void show()
	{
		System.out.println(companyname);
	}
}
class employee
{
	public int employeeid=101;
	company c1=new company();
	public void show1()
	{
		System.out.println(employeeid);
	}
}
class project
{
	public String projectname="backery management";
	employee e1=new employee();
	public void show2()
	{
		System.out.println(projectname);
		
	}
}

public class first 
{

	public static void main(String[] args) 
	{
	project p1=new project();
	p1.show2();
	p1.e1.show1();
	p1.e1.c1.show();
   }

}
