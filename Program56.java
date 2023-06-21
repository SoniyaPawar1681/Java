package demo;
class person
{
 int age;
 public void check()
 {
age=23;
if(age>18)
{
	System.out.println("valid");
}
else
{
	System.out.println("Invalid");
}
}

public class first 
{

	public static void main(String[] args) 
	{
		person p1=new person();
		p1.check();

	}

}
}
