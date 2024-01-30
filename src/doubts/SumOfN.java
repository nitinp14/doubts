package doubts;

import java.util.Scanner;

public class SumOfN {
	public static void main(String[] args) {
		int sum =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of p");
		int p=sc.nextInt();
		for(int i=0;i<=p;i++)
		{
			sum+=i;
			
		}
		System.out.println("sum of first p numbers are "+ sum);
	}
}
