package one_dimentional;
import java.util.*;
public class sum_of_array
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Array:");
        for(int i=0;i<5;i++)
        {
        	
        	a[i]=s1.nextInt();
        
        }
        {
          System.out.println("sum of array is:");
          {
        	int sum=0;
        	for (int i=0;i<5;i++)
        	{
        		sum=sum+a[i];
        	}
        	System.out.println(sum);
          }
        }
	}

}
