package doubts;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of n ");
		int n=sc.nextInt();
		int i;
		for (i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("is not prime");
				break;
				
			}
		}
		if(n==i) {
			System.out.println("prime");
			
		}
	}
	
}
