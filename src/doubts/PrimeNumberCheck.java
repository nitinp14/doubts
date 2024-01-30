package doubts;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n= sc.nextInt();
		int count=0;
		boolean rs=isPrime(n);
		if(rs==true) 
		{
			System.out.println("is a prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
	public static boolean isPrime(int p)
	{
		int c=0;
		for(int i=1;i<=p;i++)
		{
			if(p%i==0)
			{
				c++;
			}
		}
		return c==2;
	}
}
