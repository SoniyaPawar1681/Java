package inheritance;
class collage
{
	public void display()
	{
		System.out.println("collage name is:JSPM");
	}
}
class student extends collage
{
	public void show()
	{
		System.out.println("student name is:Ankita");
	}
}
class student2 extends collage
{
	public void check() 
	{
		System.out.println("student2 name is:Mayuri");
	}
}
public class hierachical {

	public static void main(String[] args) 
	{
		student s1=new student();
		s1.display();
		s1.show();
		
		student2 s2=new student2();
		s2.check();

	}

}
