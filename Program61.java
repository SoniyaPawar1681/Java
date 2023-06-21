package abc;

public class switch_case
{

	public static void main(String[] args) 
	{
		int a=4,b=10,c=7;
		int squ=0;
		int cube=0;
		int choice=2;
		switch(choice)
		{
		case 1:
		  
		  squ=a*a;
		  System.out.println("square is"+squ);
		  break;
		case 2:
			
			cube=a*a*a;
			 System.out.println("cube is"+cube);
			  break;
		case 3:
			if(b>c)
			{
				System.out.println("true");	
			}
			else 
			{
				System.out.println("false");
			}
			break;
			default:
				System.out.println("invalid choice");
		}
	}

}
