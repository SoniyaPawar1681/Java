package pallindrom;

public class first 
{

	public static void main(String[] args)
	{
		int no=131,rem,temp,sum=0;
        temp=no;
        while(no>0)
        {
        	rem=no%10;
        	sum=sum*10+rem;
        	no=no/10;
        }
        if(temp==sum)
        {
        	System.out.println("no is a pallindrom no "+sum);
        }
        else
        {
        	System.out.println("no is not a pallindrom no "+sum);
        }
	}

}
