package polymophism1;
class college
{
	public void disp()
	{
		System.out.println("welcome");
	}
}
class student extends college
{
	public void disp()
	{
		super.disp();
		System.out.println("hello");
	}
}
public class mehod_overriding 
{

	public static void main(String[] args) 
	{
	 student s1=new student();
	 s1.disp();

	}

}
