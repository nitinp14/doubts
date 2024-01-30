package doubts;

public class Fib {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int f=0;
		
		for(int i=0;i<20;i++)
		{ 
			System.out.println(n1);
			f=n1+n2;
			
			n1=n2;
			n2=f;
			
		}
	}
}
