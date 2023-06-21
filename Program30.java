package collectionfreamework1;
import java.util.*;
public class array_to_list 
{

	public static void main(String[] args) 
	{
		Float a[]=new Float[5];
		a[0]=45.89f;
		a[1]=56.78f;
		a[2]=89.2f;
		a[3]=45.78f;
		a[4]=67.4f;
		
		List<Float> l1=new ArrayList<Float>();
		
		for(Float t:a)
		{
			l1.add(t);
			
		}
         System.out.println(l1);
	}

}
