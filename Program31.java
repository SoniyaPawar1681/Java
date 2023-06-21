package collectionfreamework1;
class kites
{
	public<R> void get(R[]a)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class Generics 
{

	public static void main(String[] args)
	{
		kites k1=new kites();
		String a[]= {"ABC","XYZ","PQR","MMM","EFG"};
		k1.get(a);
		
		Integer b[]= {23,56,78,56,90};
		k1.get(b);
		
		Double c[]= {23.4,45.8,76.7,89.6,65.9};
		k1.get(c);


	}

}
