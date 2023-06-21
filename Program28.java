package First;

class Person
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
		 System.out.println("invalid");
	 }
   }
 }
public class Sky 
{

	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.check();

	}

}
