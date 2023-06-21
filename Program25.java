package two_dimentional;
import java.util.*;
public class display_two_array 
{

	public static void main(String[] args)
	{
	  int a[][]=new int[3][3];
	  int b[][]=new int[3][3];
      int i,j;
      Scanner s1=new Scanner(System.in);
      System.out.println("Accept A Array:");
      for(i=0;i<3;i++)
      {
    	  for(j=0;j<3;j++)
    	  {
    		  a[i][j]=s1.nextInt();
    	  }
      }
      System.out.println("Display A array:");
      for(i=0;i<3;i++)
      {
    	  for(j=0;j<3;j++)
    	  {
    		  System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println();
      }
      System.out.println("Accept B Array:");
      for(i=0;i<3;i++)
      {
    	  for(j=0;j<3;j++)
    	  {
    		  b[i][j]=s1.nextInt();
    	  }
      }
      System.out.println("Display B array:");
      for(i=0;i<3;i++)
      {
    	  for(j=0;j<3;j++)
    	  {
    		  System.out.print(b[i][j]+" ");
    	  }
    	  System.out.println();
      }
	}

}
