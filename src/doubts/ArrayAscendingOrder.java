package doubts;

import java.util.Scanner;

public class ArrayAscendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of thr array");
		int n=sc.nextInt();
		int []arr=new int[n];
		
		System.out.println("enter the elements in the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("array in ascending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
