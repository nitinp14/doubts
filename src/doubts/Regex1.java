package doubts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the name");
//		String name=sc.nextLine();
//		if(name==[a-zA-z])
//		{
//			
//}
		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("ababbab");
		while(m.find())
		{
			count++;
//			below statement will tell the start index of the pattern matched
			System.out.println(m.start()+m.group());
			System.out.println("end :"+m.end());
			
		}
		System.out.println("the total num of occurance is "+count);
	}
}
//0ab
//end :2
//2ab               output
//end :4
//5ab
//end :7
//the total num of occurance is 3

