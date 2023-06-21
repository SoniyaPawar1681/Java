package string1;
import java.util.*;
public class string_function 
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner s1=new Scanner(System.in);
		choice=s1.nextInt();
		String str="Good Morning";
		String str1="good morning";
		String str2="  hello";
		switch(choice)
		{
		case 1:
		  System.out.println(str.charAt(0));
		  break;
		case 2:
			System.out.println(str.toUpperCase());
			break;
		case 3:
			System.out.println(str.toLowerCase());
			break;
		case 4:
			System.out.println(str.length());
			break;
		case 5:
			System.out.println(str.indexOf("r"));
			break;
		case 6:
			System.out.println(str2.trim());
			break;
		case 7:
			System.out.println(str.replace("n","e"));
		break;
		case 8:
			System.out.println(str.substring(4));
			System.out.println(str.substring(5,7));
			break;
		case 9:
			System.out.println(str.equals(str1));
			break;
		case 10:
			System.out.println(str.equalsIgnoreCase(str1));
			break;
		case 11:
			System.out.println(str.concat(str1));
			break;
			default:
			{
				System.out.println("not matched");
			}
		}

	}

}
