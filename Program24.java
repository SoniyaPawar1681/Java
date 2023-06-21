package two_dimentional;
import java.util.*;
public class Addition 
{

	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		 int sum=0;
		Scanner s1=new Scanner(System.in);
	      System.out.println("Enter Array element:");
	      for(int i=0;i<3;i++)
	      {
	    	  for( int j=0;j<3;j++)
	    	  {
	    		  a[i][j]=s1.nextInt();
	    	  }
	      }
	    		  System.out.println("Sum of Array is:");
	    		 
	    	      for( int i=0;i<3;i++)
	    	      {
	    	    	  for( int j=0;j<3;j++)
	    	    	  {
	    	    		  sum=sum+a[i][j];
	    	    	  }
	    	    	  
	    	      }
	    	      System.out.println(sum);
	    }
}
