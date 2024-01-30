package doubts;

import java.util.Scanner;

public class CountVowelsConSpecialDigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		int cc=0,dc=0,sc=0,vc=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z'||ch>='a' && ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vc++;
				}
				else
					cc++;
				}
			else if(ch>='0'&& ch<='9')
			{
				dc++;
			}
			else 
				sc++;
			
		}
		System.out.println("vowels are " +vc);
		System.out.println("special chars "+sc);
		System.out.println("digits "+dc);
		System.out.println("consonant are "+cc);
	}
}
