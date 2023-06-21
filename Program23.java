package one_dimentional;

public class task3 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int i,max=a[0],rem,sum=0;
		a[0]=23;
        a[1]=45;
        a[2]=92;
        a[3]=12;
        a[4]=91;
        for(i=0;i<5;i++)
        {
        	if(a[i]>max)
        	{
        		max=a[i];
        		
        	}
        }
        System.out.println("Display Maximum Number Array:"+max);
         while(max>0)         
         {
        	 rem=max%10;      
        	 sum=sum+rem;    
        	 max=max/10;     
         }
         System.out.println("sum odf max no:"+sum);
         a[2]=sum;
         System.out.println("array element:");
         for(i=0;i<5;i++)
         {
        	 System.out.println(a[i]);
         }
	}

}
