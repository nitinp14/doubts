package doubts;

public class Number {
	public static void main(String[] args) {
	numb(1);
	}
	public static int numb(int n)
	{
		if(n<11)
		{
		System.out.println(n);
			return numb(n+1);
		}
		else {
			return 10;
		}
	}
}
