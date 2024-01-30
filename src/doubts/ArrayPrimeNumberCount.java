package doubts;

import java.util.Scanner;

public class ArrayPrimeNumberCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("enter the elements in the array");
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			boolean rs=isPrime(ar[i]);
					if(rs==true)
						count++;
		}
		System.out.println(count);
	}
	public static boolean isPrime(int p)
	{
		int c=0;
		for(int i=1;i<=p;i++) {
			if(p%i==0)
				c++;
			
		}
		return c==2;
	}
}
