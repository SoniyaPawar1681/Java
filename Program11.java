package Array;
import java.util.*;
public class Third {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner s1=new Scanner(System.in);
        System.out.println("Enter Array:");
        for(int i=0;i<5;i++)
        {
        	a[i]=s1.nextInt();
        }
        System.out.println("Display Array:");
        for(int i=0;i<5;i++)
        {
        	System.out.println(a[i]);
        }
	}
}
