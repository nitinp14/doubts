package new1;

public class RecursionNo {
	public static void main(String[] args) {
		num(10);
	}
	public static int num(int n)
	{
		if(n>1)
		{
			System.out.println(n);
			return num(n-1); 
		}
		else {
			 return 1;
		}
	}
}
