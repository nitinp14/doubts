package doubts;

import java.util.Scanner;

public class SmallestArrayElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the lenght");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		System.out.println(small);
	}
}
