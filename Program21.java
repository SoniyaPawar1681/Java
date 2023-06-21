package one_dimentional;
import java.util.*;
public class max_no 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int i,max=a[0];
		a[0]=45;
        a[1]=57;
        a[2]=76;
        a[3]=98;
        a[4]=23;
        for(i=0;i<5;i++)
        {
        	if(a[i]>max)
        	{
        		max=a[i];
        		
        	}
        }
        System.out.println("Display Maximum Number of Array:"+max);
	}

}
