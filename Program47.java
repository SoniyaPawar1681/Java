package first;
import java.io.*;
import java.util.*;
public class switchprogram 
{

	public static void main(String[] args) throws Exception
	{
		int choice;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		choice=sc.nextInt();
		
		
		switch(choice)
		{
			case 1:
				
				FileOutputStream f1=new FileOutputStream("C:\\Users\\Soniya Pawar\\Desktop\\Soniya\\kites.txt");
				System.out.println("File Created");
				String name="Welcome To The Satara";
				byte b[]=name.getBytes();
				f1.write(b);
				
				System.out.println("Record Saved");
				break;
				
			case 2:
				FileInputStream f2=new FileInputStream("C:\\Users\\Soniya Pawar\\Desktop\\Soniya\\kites.txt");
				int ch;
				while((ch=f2.read())!=-1)
				{
					System.out.println((char)ch);
				}
                break;
                
			case 3:
				FileWriter f3=new FileWriter("C:\\Users\\Soniya Pawar\\Desktop\\Soniya\\Demo.txt");
				f3.write("Hello Student Good Morning");
				f3.close();
				System.out.println("Record Saved");
				break;
				
			case 4:
				FileReader f4=new FileReader("C:\\Users\\Soniya Pawar\\Desktop\\Soniya\\Demo.txt");
				int c;
				while((c=f4.read())!=-1)
				{
					System.out.println((char)c);
				}
				break;
                
             default:
             {
            	 System.out.println("Invalid Choice");
             }
		
		}
		
	}

}
