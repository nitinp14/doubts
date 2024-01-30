package doubts;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplictesInArray {
	public static void main(String[] args) {
		int arr[]= {3,8,6,97,2,2,2,3};
		Set<Integer> s=new TreeSet<Integer>();
		for(int i:arr)
		{
			s.add(i);
			
		}
		System.out.println(s);
	}
}
