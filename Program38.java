package count1;

public class number
{

	public static void main(String[] args)
	{
		int no=153,temp,rev,sum=0;
		temp=no;
        do
        {
        	rev=no%10;
        	sum=sum+rev*rev*rev;
        	no=no/10;
        }while(no>0);
        if(sum==temp)
        {
        	System.out.println("no is armstrong no");
        }
        else
        {
        	System.out.println("no is not armstrong no");
        }
	}

}
