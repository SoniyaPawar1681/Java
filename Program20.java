package one_dimentional;

public class max_no_of_right_side 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int i,max=a[0],temp=0,j;
		a[0]=23;
        a[1]=45;
        a[2]=67;
        a[3]=98;
        a[4]=12;
        for(i=0;i<5;i++)
        {
        	if(a[i]>max)
        	{
        		max=a[i];
        		
        	}
        }
        System.out.println("Display Maximum Number of Array:"+max);
        for(j=0;j<5;j++)
        {
        	temp=max%10;
        }
	
	   System.out.println("maximum no of right side:"+temp);
	}
}
