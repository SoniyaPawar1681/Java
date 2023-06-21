package first;
import java.io.*;
public class Home 
{

	public static void main(String[] args)throws Exception
	{
		FileOutputStream f1=new FileOutputStream("C:\\Users\\Soniya Pawar\\Desktop\\Soniya\\kites.txt");
		System.out.println("File Created");
		
		String name="Welcome To The India";
		byte b[]=name.getBytes();
		f1.write(b);
		f1.close();
		System.out.println("Record Saved");

	}

}
