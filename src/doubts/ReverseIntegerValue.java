package doubts;

public class ReverseIntegerValue {
	public static void main(String[] args) {
		
		int n=1243;
		
		int rev=0;
		for(int i=0;i<=n;i++)
		{
			int r=n%10;
			rev=r+rev*10;
			n=n/10;
			
		}
		System.out.println(rev);
		
	}
}
