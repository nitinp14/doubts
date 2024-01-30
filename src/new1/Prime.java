package new1;

public class Prime {
	public static void main(String[] args)
	{
		
	int n=33;
	int i;
	
	for( i=2;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println("not prime");
			break;
		}
		
	}
	if(n==i){
		
		System.out.println("prime");
	
}
}
}
