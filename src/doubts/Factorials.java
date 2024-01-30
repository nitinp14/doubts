package doubts;

public class Factorials {
	public static void main(String[] args) {
		System.out.println(facto(5));
		//int f=1;
//		for(int i=1;i<=3;i++)
//		{
//			f=f*i;
//		}
//		System.out.println(f);
	
/*	int i=5;
	while(i>=1)
	{
		f=i*f;
		i--;
	}
	System.out.println(f);
	*/
	}
	public static int facto(int n)
	{
		if(n!=0)
		{
			return n*facto(n-1) ;
		}
		else {
			return 1;
		}
		
		
	}
}
