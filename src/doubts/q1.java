package doubts;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number,till where u want to print the numbers");
		int p = sc.nextInt();
		for (int i = 1; i <= p; i++) {
			System.out.println(i);
		}
		for (int i=p;i>0;i--)
		{
			System.out.println(i);
		}
	}
}
