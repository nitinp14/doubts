package doubts;

import java.util.Iterator;
import java.util.Scanner;

public class BigArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int [] ar=new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		int big=ar[0];

		for (int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
		}
		System.out.println(big);
		
	}
}
