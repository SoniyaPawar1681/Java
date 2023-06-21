package first;
import java.io.*;
public class Copy 
{

	public static void main(String[] args) throws Exception
	{
		
		FileWriter fr=new FileWriter("C:\\Users\\Soniya Pawar\\Desktop\\Soniya\\cpy.txt");
		fr.write("Hello Student Good Morning");
		fr.close();
		System.out.println("Record Saved");
		
		FileReader f1=new FileReader("C:\\Users\\Soniya Pawar\\Desktop\\Soniya\\cpy.txt");
		int c;
		while((c=f1.read())!=-1)
		{
			System.out.println((char)c);
		}
		
		FileWriter fr1=new FileWriter("C:\\Users\\Soniya Pawar\\Desktop\\Soniya\\cpy1.txt");
		fr1.write(c);
		System.out.println("new file created");
		System.out.println("copy successfully");
		
		
	}

}
