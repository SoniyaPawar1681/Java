package reverse1;

public class reverse_no 
{

	public static void main(String[] args) 
	{
		int no=345,rev,count=0,temp;
        temp=no;
        while(no>0)
        {
        	rev=no%10;
        	no=no/10;
        	if(rev>=0)
        	{
        		count++;
        	}
        }
        System.out.println(count);
	}

}
